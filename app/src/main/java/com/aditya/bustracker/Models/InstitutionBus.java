package com.aditya.bustracker.Models;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;

/**
 * Created by Aditya on 5/20/2017.
 */

public class InstitutionBus extends BasicBus{
    public ArrayList<Stop> stops;

    public InstitutionBus() {
    }

    public InstitutionBus(String busRegNumber, String depoLocation, String driverName, String driverPhoneNumber, String inchargeName, String inchargePhoneNumber, String lastStop, String seatingCapacity, String startingStop, ArrayList<Passenger> passengersList, ArrayList<Stop> stops) {
        super(busRegNumber, depoLocation, driverName, driverPhoneNumber, inchargeName, inchargePhoneNumber, lastStop, seatingCapacity, startingStop, passengersList);
        this.stops = stops;
    }

    public ArrayList<Stop> getStops() {
        return stops;
    }



}
