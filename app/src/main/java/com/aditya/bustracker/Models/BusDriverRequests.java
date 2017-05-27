package com.aditya.bustracker.Models;

/**
 * Created by Aditya on 5/20/2017.
 */

public class BusDriverRequests {

     private String busKey,driverKey,status;

    public BusDriverRequests(String busKey, String driverKey, String status) {
        this.busKey = busKey;
        this.driverKey = driverKey;
        this.status = status;
    }
}
