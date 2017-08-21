package com.example.yaroslav.myapplication.ui;

import com.example.yaroslav.myapplication.Logger;

/**
 * Created by yaroslav on 20.08.17.
 */

public class MainPresenter {

    private Logger mLogger;


    public MainPresenter(Logger logger) {
        mLogger = logger;
    }

    public void invokeLogger(){
        mLogger.log();
    }
}
