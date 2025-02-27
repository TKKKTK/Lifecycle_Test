package com.example.carsearch.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.carsearch.R;
import com.example.carsearch.base.BaseFragment;
import com.example.carsearch.mapview.avp.AvpLayout;

public class AvpFragment extends BaseFragment {
    private AvpLayout mAvpLayout;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.avp_fragment,container,false);
        mAvpLayout = view.findViewById(R.id.avp_layout);
        getLifecycle().addObserver(mAvpLayout);
        return view;
    }
}
