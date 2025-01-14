package edu.wgu.d387_sample_code.newCode;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PreDestroy;
import java.util.List;

@RestController
public class messageController {
    private final messageService messageService;

    public messageController(messageService messageService) {
        this.messageService = messageService;
    }

    @CrossOrigin(origins = "http://localhost:4200") // Enable CORS for this endpoint
    @GetMapping("/messages")
    public List<String> getMessages() {
        return messageService.getMessages();
    }

    @PreDestroy
    public void shutdownService() {
        messageService.shutdownExecutor();
    }
}
