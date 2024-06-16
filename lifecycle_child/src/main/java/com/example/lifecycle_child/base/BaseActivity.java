package com.example.lifecycle_child.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;

import com.example.lifecycle_child.LifecycleApplocation;
import com.example.lifecycle_child.data.MapType;

public abstract class BaseActivity extends AppCompatActivity {

    protected abstract void createPages();

    protected abstract void mapTapeChange(MapType mapType);


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        createPages();
        LifecycleApplocation.mapTypeViewModel.getMapTypeMutableLiveData().observe(this, new Observer<MapType>() {
            @Override
            public void onChanged(MapType mapType) {
                mapTapeChange(mapType);
            }
        });
    }


}
