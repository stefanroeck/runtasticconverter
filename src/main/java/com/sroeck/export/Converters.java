package com.sroeck.export;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.GregorianCalendar;

public final class Converters {
    private static final Logger LOG = LoggerFactory.getLogger(TCXBuilder.class);

    private Converters() {};

    static double longToDouble(Long value) {
        return value != null ? value.doubleValue() : 0.0f;
    }

    public static XMLGregorianCalendar toXmlGregorianCal(Object value) {
        if (value != null){
            Instant startTime;
            if ((value instanceof Long)|| (value instanceof  Integer)) {
                startTime = Instant.ofEpochMilli((Long) value);
            } else if (value instanceof String){
                // 2019-04-11 06:40:46 +0200
                TemporalAccessor ttt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss Z").parse((String) value);
                startTime = Instant.from(ttt);
            } else {
                LOG.warn("Unknown date format: {}", new Object[]{value});
                return null;
            }
            return toXmlGregorianCal(startTime);
        }
        else {
            return null;
        }
    }

    private static XMLGregorianCalendar toXmlGregorianCal(Instant startTime) {
        try {
            GregorianCalendar calendar = GregorianCalendar.from(ZonedDateTime.ofInstant(startTime, ZoneId.of("Z")));
            XMLGregorianCalendar xmlGregorianCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
            return xmlGregorianCalendar;
        } catch (DatatypeConfigurationException e) {
            LOG.warn("Cannot convert time {}", startTime, e);
        }
        return null;
    }
}
