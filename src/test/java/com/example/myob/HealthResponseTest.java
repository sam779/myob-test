package com.example.myob;

import org.junit.jupiter.api.Test;

import java.net.HttpURLConnection;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.*;

class HealthResponseTest {

    @Test
    void testHealth() throws Exception {
        // Given
//        HttpURLConnection connection = (HttpURLConnection) new URL("http://localhost:8080/health").openConnection();

        // When
//        final int resultResponseCode = connection.getResponseCode();
        final String resultStatus = new Health("UP").getStatus();

        // Then
//        assertEquals(200, resultResponseCode, "Error in connection");
//        if(resultResponseCode == 200) {
//            assertEquals("UP", resultStatus, "Error in status");
//        } else {
//            assertEquals("DOWN", resultStatus, "Error in status");
//        }

    }
}