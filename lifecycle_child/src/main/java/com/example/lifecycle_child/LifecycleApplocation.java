package com.example.lifecycle_child;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;

import com.example.lifecycle_child.data.MapType;
import com.example.lifecycle_child.data.MapTypeViewModel;

public class LifecycleApplocation extends Application implements ViewModelStoreOwner {

    public static MapTypeViewModel mapTypeViewModel;
    private ViewModelStore mAppViewModelStore;
    @Override
    public void onCreate() {
        super.onCreate();
        mapTypeViewModel = new ViewModelProvider(this).get(MapTypeViewModel.class);
        mapTypeViewModel.getMapTypeMutableLiveData().postValue(MapType.SD);
    }

    @NonNull
    @Override
    public ViewModelStore getViewModelStore() {
        if (mAppViewModelStore == null) mAppViewModelStore = new ViewModelStore();
        return mAppViewModelStore;
    }

}
