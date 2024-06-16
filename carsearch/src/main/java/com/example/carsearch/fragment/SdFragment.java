package com.example.carsearch.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.carsearch.R;
import com.example.carsearch.base.BaseFragment;
import com.example.carsearch.mapview.sd.SdLayout;

public class SdFragment extends BaseFragment {
    private SdLayout mSdLayout;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.sd_fragment,container,false);
        mSdLayout = view.findViewById(R.id.sd_layout);
        //把Fragment的生命周期观察添加给sdLayout
        getLifecycle().addObserver(mSdLayout);
        return view;
    }
}
