package com.example.socialconnectapp.dependencies;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {ApplicationModule.class,
        AndroidSupportInjectionModule.class})
interface AppComponent extends AndroidInjector<MyApplication> {
}
