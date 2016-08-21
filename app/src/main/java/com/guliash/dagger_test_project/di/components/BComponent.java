package com.guliash.dagger_test_project.di.components;

import com.guliash.dagger_test_project.di.modules.BModule;
import com.guliash.dagger_test_project.di.modules.CModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = BModule.class)
public interface BComponent {

    CComponent plus(CModule cModule);

}
