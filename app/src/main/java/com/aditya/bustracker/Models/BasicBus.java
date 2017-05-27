package com.aditya.bustracker.Models;

import java.util.ArrayList;

/**
 * Created by Aditya on 5/21/2017.
 */

class BasicBus {
    public BasicBus() {
    }

    private String busRegNumber,depoLocation,driverName,driverPhoneNumber,inchargeName,inchargePhoneNumber,lastStop,seatingCapacity,startingStop;
    ArrayList<Passenger> passengersList;

    public String getBusRegNumber() {
        return busRegNumber;
    }

    public void setBusRegNumber(String busRegNumber) {
        this.busRegNumber = busRegNumber;
    }

    public String getDepoLocation() {
        return depoLocation;
    }

    public void setDepoLocation(String depoLocation) {
        this.depoLocation = depoLocation;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverPhoneNumber() {
        return driverPhoneNumber;
    }

    public void setDriverPhoneNumber(String driverPhoneNumber) {
        this.driverPhoneNumber = driverPhoneNumber;
    }

    public String getInchargeName() {
        return inchargeName;
    }

    public void setInchargeName(String inchargeName) {
        this.inchargeName = inchargeName;
    }

    public String getInchargePhoneNumber() {
        return inchargePhoneNumber;
    }

    public void setInchargePhoneNumber(String inchargePhoneNumber) {
        this.inchargePhoneNumber = inchargePhoneNumber;
    }

    public String getLastStop() {
        return lastStop;
    }

    public void setLastStop(String lastStop) {
        this.lastStop = lastStop;
    }

    public String getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(String seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public String getStartingStop() {
        return startingStop;
    }

    public void setStartingStop(String startingStop) {
        this.startingStop = startingStop;
    }

    public ArrayList<Passenger> getPassengersList() {
        return passengersList;
    }

    public void setPassengersList(ArrayList<Passenger> passengersList) {
        this.passengersList = passengersList;
    }

    BasicBus(String busRegNumber, String depoLocation, String driverName, String driverPhoneNumber, String inchargeName, String inchargePhoneNumber, String lastStop, String seatingCapacity, String startingStop, ArrayList<Passenger> passengersList) {
        this.busRegNumber = busRegNumber;
        this.depoLocation = depoLocation;
        this.driverName = driverName;
        this.driverPhoneNumber = driverPhoneNumber;
        this.inchargeName = inchargeName;
        this.inchargePhoneNumber = inchargePhoneNumber;
        this.lastStop = lastStop;
        this.seatingCapacity = seatingCapacity;
        this.startingStop = startingStop;
        this.passengersList = passengersList;
    }
}
