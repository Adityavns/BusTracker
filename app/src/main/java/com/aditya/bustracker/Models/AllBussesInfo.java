package com.aditya.bustracker.Models;

import java.util.ArrayList;

/**
 * Created by Aditya on 5/21/2017.
 */

public class AllBussesInfo extends BasicBus {
    private ArrayList<LocationInfoWithNotification> locationInfoWithNotifications;

    public AllBussesInfo(String busRegNumber, String depoLocation, String driverName, String driverPhoneNumber, String inchargeName, String inchargePhoneNumber, String lastStop, String seatingCapacity, String startingStop, ArrayList<Passenger> passengersList, ArrayList<LocationInfoWithNotification> locationInfoWithNotifications) {
        super(busRegNumber, depoLocation, driverName, driverPhoneNumber, inchargeName, inchargePhoneNumber, lastStop, seatingCapacity, startingStop, passengersList);
        this.locationInfoWithNotifications = locationInfoWithNotifications;
    }
}
