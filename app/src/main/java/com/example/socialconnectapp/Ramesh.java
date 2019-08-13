package com.example.socialconnectapp;

public class Ramesh {

    public Ramesh(String name, String emailId, boolean availability) {
        this.name = name;
        this.emailId = emailId;
        this.availability = availability;
    }

    private String name, emailId;
    private boolean availability;

    public String getName() {
        return name;
    }

    public String getEmailId() {
        return emailId;
    }

    public boolean isAvailability() {
        return availability;
    }
}
