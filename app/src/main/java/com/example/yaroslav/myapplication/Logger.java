package com.example.yaroslav.myapplication;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by yaroslav on 20.08.17.
 */

public class Logger {
    private static final String TAG = "Logger";
    private Context mContex;

    public Logger(Context context) {
        mContex = context;
    }

    public void log(){
        Toast.makeText(mContex, "YEAH",  Toast.LENGTH_LONG).show();
        Log.d(TAG, "log: 1234" );
    }


}
