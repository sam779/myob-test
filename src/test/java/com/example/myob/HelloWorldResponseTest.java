package com.example.myob;

import org.junit.jupiter.api.Test;


import java.net.HttpURLConnection;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldResponseTest {

    @Test
    void testHelloWorld() throws Exception {

        //Given
        HttpURLConnection connection = (HttpURLConnection) new URL("http://localhost:8080/").openConnection();
        HelloWorld resultResponse = HelloWorldResponse.helloWorld("");

        // When
        final int resultResponseCode = connection.getResponseCode();
        final String resultMessage = resultResponse.getMessage();

        // Then
        assertEquals(200, resultResponseCode, "Error in connection");
        assertEquals("Hello World!", resultMessage, "Error in message");
    }
}