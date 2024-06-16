package com.example.carsearch.data;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MapTypeViewModel extends ViewModel {
      MutableLiveData<MapType> mapTypeMutableLiveData;

      public MapTypeViewModel(){
          if (mapTypeMutableLiveData == null){
                mapTypeMutableLiveData = new MutableLiveData<>();
          }
      }

    public MutableLiveData<MapType> getMapTypeMutableLiveData() {
        return mapTypeMutableLiveData;
    }
}
