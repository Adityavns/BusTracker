package com.aditya.bustracker.Models;

import com.google.android.gms.maps.model.LatLng;

import java.sql.Time;

/**
 * Created by Aditya on 5/20/2017.
 */

 class AllBusLocationInfo {
    private LatLng busLat,busLng;
    private Long lastUpdatedAt;
    private String currentStop;
    private String nextStop;

    AllBusLocationInfo(LatLng busLat, LatLng busLng, Long lastUpdatedAt, String currentStop, String nextStop) {
        this.busLat = busLat;
        this.busLng = busLng;
        this.lastUpdatedAt = lastUpdatedAt;
        this.currentStop = currentStop;
        this.nextStop = nextStop;
    }
}
