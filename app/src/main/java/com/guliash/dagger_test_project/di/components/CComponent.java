package com.guliash.dagger_test_project.di.components;

import com.guliash.dagger_test_project.MainActivity;
import com.guliash.dagger_test_project.di.modules.CModule;
import com.guliash.dagger_test_project.di.scopes.MyScope;

import dagger.Subcomponent;

@MyScope
@Subcomponent (modules = CModule.class)
public interface CComponent {

    void inject(MainActivity activity);

}
