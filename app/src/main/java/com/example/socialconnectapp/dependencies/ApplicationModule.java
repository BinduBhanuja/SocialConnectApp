package com.example.socialconnectapp.dependencies;

import com.example.socialconnectapp.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ApplicationModule {

    @ContributesAndroidInjector
    abstract MainActivity mainActivity();
}
