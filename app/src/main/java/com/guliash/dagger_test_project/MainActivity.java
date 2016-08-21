package com.guliash.dagger_test_project;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.guliash.dagger_test_project.di.components.DaggerAComponent;
import com.guliash.dagger_test_project.di.modules.CModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    String string;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerAComponent.create().plus(new CModule()).inject(this);
    }
}
