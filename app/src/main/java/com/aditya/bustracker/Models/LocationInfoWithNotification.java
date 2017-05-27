package com.aditya.bustracker.Models;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;

/**
 * Created by Aditya on 5/21/2017.
 */

public class LocationInfoWithNotification extends AllBusLocationInfo {
private ArrayList<NotificationsToBeSent> notifications;

    public LocationInfoWithNotification(LatLng busLat, LatLng busLng, Long lastUpdatedAt, String currentStop, String nextStop, ArrayList<NotificationsToBeSent> notifications) {
        super(busLat, busLng, lastUpdatedAt, currentStop, nextStop);
        this.notifications = notifications;
    }
}
