package com.example.yaroslav.myapplication.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.yaroslav.myapplication.R;

import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
