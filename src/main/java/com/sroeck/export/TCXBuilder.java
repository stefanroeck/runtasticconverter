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
import java.util.List;

import static com.sroeck.export.Converters.longToDouble;
import static com.sroeck.export.Converters.toXmlGregorianCal;

public class TCXBuilder implements Exporter{

    private static final Logger LOG = LoggerFactory.getLogger(TCXBuilder.class);

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

    private TrackpointT createTrack(GPSDatum gpsDatum) {
        TrackpointT trackPoint = new TrackpointT();
        trackPoint.setAltitudeMeters(gpsDatum.getAltitude());
        trackPoint.setDistanceMeters(longToDouble(gpsDatum.getDistance()));
        trackPoint.setTime(toXmlGregorianCal(gpsDatum.getTimestamp()));
        PositionT position = new PositionT();
        position.setLatitudeDegrees(gpsDatum.getLatitude());
        position.setLongitudeDegrees(gpsDatum.getLongitude());
        trackPoint.setPosition(position);
        return trackPoint;
    }


    private void populateLap(SportSession sportSessionData, ActivityLapT lap) {
        lap.setCalories(sportSessionData.getCalories().intValue());
        lap.setDistanceMeters(longToDouble(sportSessionData.getDistance()));
        lap.setMaximumSpeed(sportSessionData.getMaxSpeed());
        lap.setNotes(sportSessionData.getNotes());
        lap.setStartTime(toXmlGregorianCal(sportSessionData.getStartTime()));
        lap.setTotalTimeSeconds(longToDouble(sportSessionData.getDuration()));
    }

    @Override
    public void generateActivity(RuntasticActivity runtasticActivity, Path destinationDirectory) throws IOException {
        SportSession sportSession = runtasticActivity.getSession();

        TrainingCenterDatabaseT root = new TrainingCenterDatabaseT();
        ActivityListT activities = new ActivityListT();
        ActivityT activity = new ActivityT();
        activity.setId(toXmlGregorianCal(sportSession.getStartTime()));
        activity.setNotes(sportSession.getNotes());
        activity.setSport(SportT.RUNNING);

        ActivityLapT lap = new ActivityLapT();
        populateLap(sportSession, lap);
        populateTracks(runtasticActivity.getGpsData(), lap.getTrack());
        activity.getLap().add(lap);
        activities.getActivity().add(activity);
        root.setActivities(activities);

        Path outputFile = destinationDirectory.resolve(sportSession.getId() + ".gpx");
        writeContent(root, outputFile);
        LOG.info("Activity written to {}", outputFile);

    }
}
