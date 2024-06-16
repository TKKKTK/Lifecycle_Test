package com.example.lifecycle_child;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import com.example.lifecycle_child.base.BaseActivity;
import com.example.lifecycle_child.data.MapType;

import java.util.Map;

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