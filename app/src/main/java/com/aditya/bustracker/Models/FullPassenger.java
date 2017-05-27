package com.aditya.bustracker.Models;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by Aditya on 5/20/2017.
 */

public class FullPassenger extends Passenger {
 String address,gcmToken,alternateNumber,bloodGroup,busId,busStop,klass,emergencyNumber,fatherName,fullName,institutionID, phoneNumber,profilePic;

 public FullPassenger(String name, String phoneNumber, String gcmToken, String notifyAt, String notificationType, String notificationMedium, String address, String gcmToken1, String alternateNumber, String bloodGroup, String busId, String busStop, String klass, String emergencyNumber, String fatherName, String fullName, String institutionID, String phoneNumber1, String profilePic) {
  super(name, phoneNumber, gcmToken, notifyAt, notificationType, notificationMedium);
  this.address = address;
  this.gcmToken = gcmToken1;
  this.alternateNumber = alternateNumber;
  this.bloodGroup = bloodGroup;
  this.busId = busId;
  this.busStop = busStop;
  this.klass = klass;
  this.emergencyNumber = emergencyNumber;
  this.fatherName = fatherName;
  this.fullName = fullName;
  this.institutionID = institutionID;
  this.phoneNumber = phoneNumber1;
  this.profilePic = profilePic;
 }
}
