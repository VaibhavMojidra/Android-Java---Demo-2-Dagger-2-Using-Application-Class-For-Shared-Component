package com.vaibhavmojidra.androidjavademo2dagger2usingapplicationclassforsharedcomponent;

import android.app.Application;

public class PlayGameApplication extends Application {
    PlayGameComponent playGameComponent;
    @Override
    public void onCreate() {
        super.onCreate();
        playGameComponent=DaggerPlayGameComponent.create();
    }
}
