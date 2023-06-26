package com.vaibhavmojidra.androidjavademo2dagger2usingapplicationclassforsharedcomponent;

import dagger.Component;

@Component
public interface PlayGameComponent {
    PlayGame getPlayGame();
}
