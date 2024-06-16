package com.example.lifecycle_test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.carsearch.ApplicationInstance;
import com.example.carsearch.FirstActivity;
import com.example.carsearch.data.MapType;

public class MainActivity extends AppCompatActivity {
    private TextView mMapType;
    private Button en_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMapType = findViewById(R.id.map_type);
        ApplicationInstance.getInstance().getMapTypeViewModel().getMapTypeMutableLiveData().observe(this, new Observer<MapType>() {
            @Override
            public void onChanged(MapType mapType) {
                mMapType.setText(mapType.toString());
            }
        });
        ApplicationInstance.getInstance().getMapTypeViewModel().getMapTypeMutableLiveData().postValue(MapType.SD);
        en_btn = findViewById(R.id.entry);
        en_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ApplicationInstance.getInstance().getMapTypeViewModel().getMapTypeMutableLiveData().postValue(MapType.AVP);
                startActivity(new Intent(MainActivity.this, FirstActivity.class));
            }
        });
    }
}