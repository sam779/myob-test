package com.example.myob;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

@RestController
public class HealthResponse {

    private static final String template = "The Link is %s!";

    @GetMapping("/health")
    public Health health(@RequestParam(value = "name", defaultValue = "UP") String name) throws IOException {
        HttpURLConnection connection = (HttpURLConnection) new URL("http://localhost:8080/").openConnection();

        connection.setRequestMethod("GET");

        int responseCode = connection.getResponseCode();
        if(responseCode == 200) {
            name = "UP";
        } else {
            name = "DOWN";
        }
        return new Health(String.format(template, name));
    }
}