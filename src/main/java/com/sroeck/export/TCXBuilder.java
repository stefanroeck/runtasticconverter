package com.sroeck.export;

import com.sroeck.parser.RuntasticActivity;
import json.GPSDatum;
import json.SportSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tcx.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Instant;
import java.util.List;
import java.util.Map;

public class TCXBuilder implements Exporter{

    private static final Logger LOG = LoggerFactory.getLogger(TCXBuilder.class);

    private String getTime(Map<String, Object> sportSessionData, String timeAttribute) {
        Long start_time = (Long) sportSessionData.get(timeAttribute);
        return Instant.ofEpochMilli(start_time).toString();
    }

    private void writeContent(TrainingCenterDatabaseT root, Path destination) throws IOException {
        try {
            JAXBContext context = JAXBContext.newInstance(TrainingCenterDatabaseT.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            JAXBElement<TrainingCenterDatabaseT> element = new ObjectFactory().createTrainingCenterDatabase(root);
            marshaller.marshal(element, Files.newOutputStream(destination));
        } catch (JAXBException e) {
            LOG.error("Error while writing XML Stream for file: {}", destination, e);
        }
    }

    private void populateTracks(List<GPSDatum> gpsData, List<TrackT> tracks) {
        TrackT track = new TrackT();
        tracks.add(track);
        List<TrackpointT> trackPoints = track.getTrackpoint();
        gpsData.stream().forEach(row -> trackPoints.add(createTrack(row)));
    }

    private TrackpointT createTrack(GPSDatum row) {
        TrackpointT trackPoint = new TrackpointT();
        trackPoint.setTime(Converters.toXmlGregorianCal(row.getTimestamp()));
        trackPoint.setDistanceMeters(Converters.longToDouble(row.getDistance()));
        trackPoint.setAltitudeMeters(row.getAltitude());
        PositionT position = new PositionT();
        position.setLatitudeDegrees(row.getLatitude());
        position.setLongitudeDegrees(row.getLongitude());
        trackPoint.setPosition(position);
        return trackPoint;
    }


    private void populateLap(SportSession sportSessionData, ActivityLapT lap) {
        lap.setCalories(sportSessionData.getCalories().intValue());
        lap.setDistanceMeters(Converters.longToDouble(sportSessionData.getDistance()));
        lap.setMaximumSpeed(sportSessionData.getMaxSpeed());
        lap.setNotes(sportSessionData.getNotes());
        lap.setStartTime(Converters.toXmlGregorianCal(sportSessionData.getStartTime()));
        lap.setTotalTimeSeconds(Converters.longToDouble(sportSessionData.getDuration()));
    }

    @Override
    public void generateActivity(RuntasticActivity runtasticActivity, Path destinationDirectory) throws IOException {
        SportSession sportSession = runtasticActivity.getSession();

        TrainingCenterDatabaseT root = new TrainingCenterDatabaseT();
        ActivityListT activities = new ActivityListT();
        ActivityT activity = new ActivityT();
        activity.setSport(SportT.RUNNING);
        activity.setId(Converters.toXmlGregorianCal(sportSession.getStartTime()));
        ActivityLapT lap = new ActivityLapT();
        populateLap(sportSession, lap);
        populateTracks(runtasticActivity.getGpsData(), lap.getTrack());
        activity.getLap().add(lap);
        activities.getActivity().add(activity);
        root.setActivities(activities);

        Path outputFile = Paths.get( destinationDirectory.getFileName().toString(), activity.getId().toString() + ".tcx");
        writeContent(root, outputFile);
        LOG.info("Activity written to {}", outputFile);

    }
}
