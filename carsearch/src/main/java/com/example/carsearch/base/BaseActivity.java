package com.example.carsearch.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;

import com.example.carsearch.ApplicationInstance;
import com.example.carsearch.data.MapType;

public abstract class BaseActivity extends AppCompatActivity {

    protected abstract void createPages();

    protected abstract void mapTapeChange(MapType mapType);


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        createPages();
        ApplicationInstance.getInstance().getMapTypeViewModel().getMapTypeMutableLiveData().observe(this, new Observer<MapType>() {
            @Override
            public void onChanged(MapType mapType) {
                mapTapeChange(mapType);
            }
        });
    }


}
