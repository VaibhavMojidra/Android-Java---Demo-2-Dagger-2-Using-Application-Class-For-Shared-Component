package com.vaibhavmojidra.androidjavademo2dagger2usingapplicationclassforsharedcomponent;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((PlayGameApplication) getApplication()).playGameComponent.getPlayGame().playGame();
    }
}