package com.example.yaroslav.myapplication.dagger;

import android.app.Application;

import com.example.yaroslav.myapplication.Logger;
import com.example.yaroslav.myapplication.dagger.activity.ActivityComponent;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by yaroslav on 20.08.17.
 */
@Module(subcomponents = {ActivityComponent.class})
public class AppModule {

    @Provides
    @Singleton
    public Logger provideLogger(Application application){
        return new Logger(application);
    }
}
