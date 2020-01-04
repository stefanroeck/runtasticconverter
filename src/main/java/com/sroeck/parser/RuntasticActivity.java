package com.sroeck.parser;

import json.GPSDatum;
import json.SportSession;

import java.time.Instant;
import java.util.List;

public class RuntasticActivity {
    private final SportSession session;
    private final List<GPSDatum> gpsData;

    public RuntasticActivity(SportSession session, List<GPSDatum> gpsData) {
        this.gpsData = gpsData;
        this.session = session;
    }

    public List<GPSDatum> getGpsData() {
        return gpsData;
    }

    public SportSession getSession() {
        return session;
    }

    public String getInfo() {
        return String.format("SessionId=%s, StartTime=%s, Distance=%s, %d GPS points", session.getId(), Instant.ofEpochMilli(session.getStartTime()), session.getDistance(), gpsData.size());
    }
}
