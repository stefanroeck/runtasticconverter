package com.sroeck.parser;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import json.GPSDatum;
import json.SportSession;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class RuntasticParser {

    private final ObjectMapper mapper = new ObjectMapper();

    public RuntasticActivity parse(Path sportSessionFile, Path gpsDataFile) throws IOException {
        return new RuntasticActivity(toSportSession(sportSessionFile), toGpsData(gpsDataFile));
    }


    private SportSession toSportSession(Path sportSessionFile) throws IOException {
        return mapper.readValue(sportSessionFile.toFile(), SportSession.class);
    }

    private List<GPSDatum> toGpsData(Path gpsDataFile) throws IOException {
        List<GPSDatum> result = new ArrayList<>();
        ArrayNode jsonNode = (ArrayNode) mapper.readTree(gpsDataFile.toFile());
        jsonNode.forEach(row -> result.add(mapper.convertValue(row, GPSDatum.class)));
        return result;
    }
}
