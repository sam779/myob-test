package com.example.myob;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldResponseTest {

    @Test
    void testHelloWorld() throws IOException, NoSuchFieldException, IllegalAccessException {

        //Given
//        HttpURLConnection testConnection = (HttpURLConnection) new URL("http://localhost:8080/").openConnection();
        HelloWorld resultResponse = HelloWorldResponse.helloWorld("");

        // When
//        final int resultResponseCode = testConnection.getResponseCode();
        final String resultMessage = resultResponse.getMessage();

        // Then
//        assertEquals(200, resultResponseCode, "Error in connection");
        assertEquals("Hello World!", resultMessage, "Error in message");
    }
}