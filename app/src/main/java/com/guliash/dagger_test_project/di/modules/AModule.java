package com.guliash.dagger_test_project.di.modules;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AModule {

    @Provides
    @Singleton
    public String provideString() {
        return "s";
    }

}
