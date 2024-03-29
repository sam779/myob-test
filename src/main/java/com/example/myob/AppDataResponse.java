package com.example.myob;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

@RestController
public class AppDataResponse {

    @GetMapping("/about")
    public static AppData response() throws IOException {
        HttpURLConnection connection = (HttpURLConnection) new URL("http://localhost:8080/").openConnection();
        AppData appData = new AppData("myob rest", "1.0", "ops technical test");

        return appData;
    }

}