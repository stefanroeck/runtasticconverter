package com.sroeck.export;

import com.sroeck.parser.RuntasticActivity;
import gpx.*;
import json.GPSDatum;
import json.SportSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static com.sroeck.export.Converters.toXmlGregorianCal;
import static java.util.stream.Collectors.toList;

public class GPXBuilder implements Exporter{

    private static final Logger LOG = LoggerFactory.getLogger(TCXBuilder.class);

    private void writeContent(GpxType root, Path destination) throws IOException {
        try {
            JAXBContext context = JAXBContext.newInstance(GpxType.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            JAXBElement<GpxType> element = new ObjectFactory().createGpx(root);
            marshaller.marshal(element, Files.newOutputStream(destination));
        } catch (JAXBException e) {
            LOG.error("Error while writing XML Stream for file: {}", destination, e);
        }
    }

    @Override
    public void generateActivity(RuntasticActivity runtasticActivity, Path destinationDirectory) throws IOException {
        SportSession sportSession = runtasticActivity.getSession();

        GpxType root = new GpxType();
        root.setMetadata(toMetadata(sportSession));
        root.getTrk().add(toTrack(runtasticActivity));

        Path outputFile = Paths.get( destinationDirectory.getFileName().toString(), sportSession.getId() + ".gpx");
        writeContent(root, outputFile);
        LOG.info("Activity written to {}", outputFile);

    }

    private MetadataType toMetadata(SportSession sportSession) {
        MetadataType metadata = new MetadataType();
        metadata.setTime(toXmlGregorianCal(sportSession.getStartTime()));
        metadata.setDesc(sportSession.getNotes());
        return metadata;
    }

    private TrkType toTrack(RuntasticActivity runtasticActivity) {
        TrkType track = new TrkType();
        TrksegType trackSegment = new TrksegType();
        List<GPSDatum> gpsData = runtasticActivity.getGpsData();
        List<WptType> wayPoints = gpsData.stream().map(gpsDatum -> toWaypoint(gpsDatum)).collect(toList());
        trackSegment.getTrkpt().addAll(wayPoints);
        track.getTrkseg().add(trackSegment);
        return track;
    }

    private WptType toWaypoint(GPSDatum gpsDatum) {
        WptType waypoint = new WptType();
        waypoint.setEle(BigDecimal.valueOf(gpsDatum.getAltitude()));
        waypoint.setLat(BigDecimal.valueOf(gpsDatum.getLatitude()));
        waypoint.setLon(BigDecimal.valueOf(gpsDatum.getLongitude()));
        waypoint.setTime(toXmlGregorianCal(gpsDatum.getTimestamp()));
        return waypoint;
    }
}
