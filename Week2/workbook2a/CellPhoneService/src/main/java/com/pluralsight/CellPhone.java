package com.pluralsight;

public class CellPhone {
    //instance variables
    //all private - type - name
    private String model;
    private String serialNumber;
    private String carrier;
    private String phoneNumber;
    private String ownerName;
    // ----------------------------default constructor


    //---------------------------- parameterized constructor

    public CellPhone(String model,  String serialNumber, String carrier, String phoneNumber, String ownerName) {
        this.model = model;
        this.serialNumber = serialNumber;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.ownerName = ownerName;
    }
    //  -------------------------------------------- getters
    public String getModel() {
        return model;
    }
    public String getSerialNumber() {
        return serialNumber;
    }
    public String getCarrier() {
        return carrier;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getOwnerName() {
        return ownerName;
    }


    public CellPhone() {
    }
    // ------------------------------------------------- setters
    public void setModel(String model) {
        this.model = model;
    }
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

}
