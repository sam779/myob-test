package com.example.myob;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

class AppDataTest {
    @Test
    void testGetters() throws NoSuchFieldException, IllegalAccessException {
        // Given
        final AppData appData = new AppData("Test Name","Test Version", "Test Description");
        final Field nameField = appData.getClass().getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(appData, "Test Name");
        final Field versionField = appData.getClass().getDeclaredField("version");
        versionField.setAccessible(true);
        versionField.set(appData, "Test Version");
        final Field descriptionField = appData.getClass().getDeclaredField("description");
        descriptionField.setAccessible(true);
        descriptionField.set(appData, "Test Description");

        // When
        final String resultName = appData.getName();
        final String resultVersion = appData.getVersion();
        final String resultDescription = appData.getDescription();

        // Then
        assertEquals("Test Name", resultName, "Error in name");
        assertEquals("Test Version", resultVersion, "Error in version");
        assertEquals("Test Description", resultDescription, "Error in description");

    }
}