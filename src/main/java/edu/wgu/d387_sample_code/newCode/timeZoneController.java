package edu.wgu.d387_sample_code.newCode;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Map;

@RestController
public class timeZoneController {

    private final timeZoneService timeZoneService = new timeZoneService();

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/presentation-times")
    public Map<String, String> getPresentationTimes() {
        LocalDateTime presentationTime = LocalDateTime.now().plusHours(1);
        return timeZoneService.getPresentationTimes(presentationTime);
    }
}
