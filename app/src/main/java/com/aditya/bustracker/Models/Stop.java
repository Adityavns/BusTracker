package com.aditya.bustracker.Models;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by Aditya on 5/20/2017.
 */

public class Stop {
    private String stopArea,stopName,stopPicUrl;
    private LatLng stopLocation;

    public Stop(String stopArea, String stopName, String stopPicUrl, LatLng stopLocation) {
        this.stopArea = stopArea;
        this.stopName = stopName;
        this.stopPicUrl = stopPicUrl;
        this.stopLocation = stopLocation;
    }
}
