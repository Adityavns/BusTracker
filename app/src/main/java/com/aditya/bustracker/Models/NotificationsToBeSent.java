package com.aditya.bustracker.Models;

/**
 * Created by Aditya on 5/20/2017.
 */

public class NotificationsToBeSent {

    private String notificationToBeSent,notificationType,passengerKey;

    public NotificationsToBeSent(String notificationToBeSent, String notificationType, String passengerKey) {
        this.notificationToBeSent = notificationToBeSent;
        this.notificationType = notificationType;
        this.passengerKey = passengerKey;
    }
}
