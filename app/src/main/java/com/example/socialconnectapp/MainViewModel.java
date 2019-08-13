package com.example.socialconnectapp;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

import javax.inject.Inject;

class MainViewModel implements LifecycleObserver {

    @Inject
    MainViewModel() {}

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        Ram ram = new Ram("Ram", "ram_1997", "Thu, 08:00pm");
        Ramesh ramesh = new Ramesh("Ramesh", "ramesh.kumar@gmail.com", true);
        Suresh suresh = new Suresh("Suresh", false);
    }
}
