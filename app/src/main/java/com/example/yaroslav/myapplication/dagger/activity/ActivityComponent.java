package com.example.yaroslav.myapplication.dagger.activity;

import com.example.yaroslav.myapplication.ui.MainActivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by yaroslav on 20.08.17.
 */
@Subcomponent(modules = {ActivityModule.class})
public interface ActivityComponent extends AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {}
}
