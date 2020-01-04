package com.sroeck;

import com.sroeck.export.Exporter;
import com.sroeck.export.GPXBuilder;
import com.sroeck.export.TCXBuilder;
import com.sroeck.parser.RuntasticActivity;
import com.sroeck.parser.RuntasticParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.util.Arrays.stream;


public class RuntasticConverterApplication  {

    private enum ExportFormat {
        GPX(new GPXBuilder()),
        TCX(new TCXBuilder());

        private final Exporter exporter;

        ExportFormat(Exporter exporter) {
            this.exporter = exporter;
        }

        public Exporter getExporter() {
            return exporter;
        }

        static ExportFormat parse(String value) {
            return stream(values()).filter(v -> v.name().equalsIgnoreCase(value)).findFirst().orElseThrow(() -> new IllegalArgumentException("Invalid export format: " + value));
        }
    }

    private static final Logger LOG = LoggerFactory.getLogger(RuntasticConverterApplication.class);
    private final RuntasticParser parser = new RuntasticParser();

    public static void main(String[] args) throws IOException {
        System.out.println("=================================================");
        System.out.println("Converter for Adidas/Runtastic Full Export.");
        System.out.println("Generates GPX/TCX files for JSON Sport Session Files.");
        System.out.println("=================================================\n");

        if (args.length != 3 || !matches(args[0], "gpx", "tcx")) {
            printUsage();
            return;
        }

        new RuntasticConverterApplication().processSportSessionFileOrDirectory(ExportFormat.parse(args[0]), args[1], Paths.get(args[2]));
    }


    private void processSportSessionFileOrDirectory(ExportFormat exportFormat, String fileOrDirectory, Path destinationDirectory) throws IOException {
        Path sessionFile = Paths.get(fileOrDirectory);
        if (!Files.exists(sessionFile) ){
            throw new IllegalArgumentException("SportSessionFile " + fileOrDirectory + " cannot be read.");
        }
        Files.createDirectories(destinationDirectory);

        // TODO: Implement directory handling
        Path gpsDataFile = sessionFile.getParent().resolve("GPS-data/" + sessionFile.getFileName());
        if (!Files.exists(gpsDataFile) ){
            LOG.error("No GPS data file found at {}", gpsDataFile);
            return;
        }

        RuntasticActivity runtasticActivity = parser.parse(sessionFile, gpsDataFile);
        LOG.info("Parsed {}", runtasticActivity.getInfo());

        exportFormat.getExporter().generateActivity(runtasticActivity, destinationDirectory);
    }

    private static boolean matches(String argument, String candidate1, String candidate2) {
        return argument != null && argument.equalsIgnoreCase(candidate1) || argument.equalsIgnoreCase(candidate2);
    }

    private static void printUsage() {
        System.out.println("Usage:");
        System.out.println("[gpx|tcx] <sportSessionJsonFile>|<sportSessionDirectory> <outputDirectory>");
    }
}
