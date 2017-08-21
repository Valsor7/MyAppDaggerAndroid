package com.example.yaroslav.myapplication.dagger;

import android.app.Activity;

import com.example.yaroslav.myapplication.dagger.activity.ActivityComponent;
import com.example.yaroslav.myapplication.ui.MainActivity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * Created by yaroslav on 20.08.17.
 */
@Module
public abstract class ActivityBuilder {
    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindMainActivity(ActivityComponent.Builder builder);
}
