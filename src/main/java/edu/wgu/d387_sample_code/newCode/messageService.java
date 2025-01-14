package edu.wgu.d387_sample_code.newCode;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@Service
public class messageService {
    private final ExecutorService messageExecutor = Executors.newFixedThreadPool(2);

    public List<String> getMessages() {
        List<String> messages = new ArrayList<>();
        try {
            Future<String> englishMessage = messageExecutor.submit(() -> loadMessage("welcome_en_US.properties"));
            Future<String> frenchMessage = messageExecutor.submit(() -> loadMessage("welcome_fr_CA.properties"));
            messages.add(englishMessage.get());
            messages.add(frenchMessage.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return messages;
    }

    private String loadMessage(String fileName) {
        Properties properties = new Properties();
        try (InputStream stream = new ClassPathResource(fileName).getInputStream()) {
            properties.load(stream);
            return properties.getProperty("welcome");
        } catch (Exception e) {
            e.printStackTrace();
            return "Error loading message from " + fileName;
        }
    }

    // Graceful shutdown of ExecutorService when application stops
    public void shutdownExecutor() {
        messageExecutor.shutdown();
    }
}
