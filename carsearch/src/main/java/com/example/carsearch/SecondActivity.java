package com.example.carsearch;

import android.os.Bundle;

import com.example.carsearch.base.BaseActivity;
import com.example.carsearch.data.MapType;

public class SecondActivity extends BaseActivity {
    @Override
    protected void createPages() {

    }

    @Override
    protected void mapTapeChange(MapType mapType) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

}