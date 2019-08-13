package com.example.socialconnectapp;

public class Ram {

    public Ram(String name, String viberId, String lastSeen) {
        this.name = name;
        this.viberId = viberId;
        this.lastSeen = lastSeen;
    }

    private String name, viberId, lastSeen;

    public String getName() {
        return name;
    }

    public String getViberId() {
        return viberId;
    }

    public String getLastSeen() {
        return lastSeen;
    }
}
