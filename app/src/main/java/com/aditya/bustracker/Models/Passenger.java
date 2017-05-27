package com.aditya.bustracker.Models;

/**
 * Created by Aditya on 5/20/2017.
 */

 class Passenger {
    private String name,phoneNumber,gcmToken,notifyAt,notificationType,notificationMedium;

    public Passenger(String name, String phoneNumber, String gcmToken, String notifyAt, String notificationType, String notificationMedium) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.gcmToken = gcmToken;
        this.notifyAt = notifyAt;
        this.notificationType = notificationType;
        this.notificationMedium = notificationMedium;
    }
}
