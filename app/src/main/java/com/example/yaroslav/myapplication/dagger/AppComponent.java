package com.example.yaroslav.myapplication.dagger;

import android.app.Application;

import com.example.yaroslav.myapplication.MyApp;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

/**
 * Created by yaroslav on 20.08.17.
 */
@Component(modules = {AppModule.class, AndroidInjectionModule.class})
public interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);
        AppComponent build();
    }

    void inject(MyApp app);
}
