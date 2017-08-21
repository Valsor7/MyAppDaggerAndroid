package com.example.yaroslav.myapplication.dagger.activity;

import com.example.yaroslav.myapplication.Logger;
import com.example.yaroslav.myapplication.ui.MainPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by yaroslav on 20.08.17.
 */
@Module
public class ActivityModule {

    @Provides
    public MainPresenter provideMainPresenter(Logger logger){
        return new MainPresenter(logger);
    }
}
