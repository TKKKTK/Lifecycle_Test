package com.example.carsearch;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.carsearch.base.BaseActivity;
import com.example.carsearch.data.MapType;
import com.example.carsearch.fragment.AvpFragment;
import com.example.carsearch.fragment.SdFragment;

import java.util.HashMap;
import java.util.Map;

public class FirstActivity extends BaseActivity {
    private Map<MapType, Fragment> mMapDataPage;

    private Button avp_btn,sd_btn;

    @Override
    protected void createPages() {
        mMapDataPage = new HashMap<MapType, Fragment>();
        AvpFragment avpFragment = new AvpFragment();
        SdFragment sdFragment = new SdFragment();
        mMapDataPage.put(MapType.AVP,avpFragment);
        mMapDataPage.put(MapType.SD,sdFragment);
    }

    @Override
    protected void mapTapeChange(MapType mapType) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.map_fragment,mMapDataPage.get(mapType));
        transaction.commit();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        initView();
    }
    private void initView(){
        avp_btn = findViewById(R.id.avp);
        sd_btn = findViewById(R.id.sd);

        avp_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ApplicationInstance.getInstance().getMapTypeViewModel().getMapTypeMutableLiveData().postValue(MapType.AVP);
            }
        });
        sd_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ApplicationInstance.getInstance().getMapTypeViewModel().getMapTypeMutableLiveData().postValue(MapType.SD);
            }
        });
    }
}