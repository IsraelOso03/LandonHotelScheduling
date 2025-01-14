package edu.wgu.d387_sample_code.newCode;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class timeZoneService {

    public Map<String, String> getPresentationTimes(LocalDateTime presentationTime) {
        Map<String, String> times = new HashMap<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        // Convert to Eastern Time
        ZonedDateTime etTime = presentationTime.atZone(ZoneId.of("America/New_York"));
        times.put("ET", formatter.format(etTime));

        // Convert to Mountain Time
        ZonedDateTime mtTime = etTime.withZoneSameInstant(ZoneId.of("America/Denver"));
        times.put("MT", formatter.format(mtTime));

        // Convert to UTC
        ZonedDateTime utcTime = etTime.withZoneSameInstant(ZoneId.of("UTC"));
        times.put("UTC", formatter.format(utcTime));

        return times;
    }
}
