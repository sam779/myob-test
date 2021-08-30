package com.example.myob;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.*;

class AppDataResponseTest {

    @Test
    void testResponse() throws IOException, NoSuchFieldException, IllegalAccessException {
        // Given
        HttpURLConnection connection = (HttpURLConnection) new URL("http://localhost:8080/about").openConnection();
        AppData resultResponse = AppDataResponse.response();

        // When
        final String resultName = resultResponse.getName();
        final String resultVersion = resultResponse.getVersion();
        final String resultDescription = resultResponse.getDescription();
        final int resultResponseCode = connection.getResponseCode();

        // Then
        assertEquals("myob rest", resultName, "Error in name");
        assertEquals("1.0", resultVersion, "Error in version");
        assertEquals("ops technical test", resultDescription, "Error in description");
        assertEquals(200, resultResponseCode, "Error in connection");
    }

}