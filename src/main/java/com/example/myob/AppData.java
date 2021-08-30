package com.example.myob;

public class AppData {

    private String name;
    private String version;
    private String description;

    public AppData(String name, String version, String description) {
        this.name = name;
        this.version = version;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public String getDescription() {
        return description;
    }

}