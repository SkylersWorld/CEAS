package com.ceas.model;

import java.time.LocalDateTime;

public class Alert {
    private String id;
    private String type; // Fire, Flood, Burglary, etc.
    private String description;
    private double latitude;
    private double longitude;
    private String reporterName; // Optional/Anonymous
    private boolean isVerified;
    private LocalDateTime timestamp;

    // Constructors, Getters, and Setters
    public Alert(String type, String description, double lat, double lon, String reporterName) {
        this.type = type;
        this.description = description;
        this.latitude = lat;
        this.longitude = lon;
        this.reporterName = (reporterName == null || reporterName.isEmpty()) ? "Anonymous" : reporterName;
        this.timestamp = LocalDateTime.now();
        this.isVerified = false;
    }
}
