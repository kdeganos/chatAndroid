package com.epicodus.chatandroid.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.epicodus.chatandroid.R;

import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


    }
}