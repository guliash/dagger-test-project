package com.guliash.dagger_test_project.di.components;

import com.guliash.dagger_test_project.di.modules.AModule;
import com.guliash.dagger_test_project.di.modules.CModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = AModule.class)
public interface AComponent {

    CComponent plus(CModule cModule);

}
