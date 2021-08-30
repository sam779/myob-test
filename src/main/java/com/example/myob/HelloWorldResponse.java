package com.example.myob;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

@RestController
public class HelloWorldResponse {

    private static final String response = "Hello World!";

    @GetMapping("/")
    public static HelloWorld helloWorld(String message) throws IOException {
        HttpURLConnection connection = (HttpURLConnection) new URL("http://localhost:8080/").openConnection();

        return new HelloWorld(String.format(response));
    }
}