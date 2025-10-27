package com.pluralsight;

public class Vehicle {

    private int vin;
    private int year;
    private String make;
    private String model;
    private String vehicleType;
    private String color;
    private double price;
    private int odometer;

    //Constructor Vehicle


    public void VehicleInfo(int vin, int year, String make, String model) {
        this.vin = vin;
        this.year = year;
        this.make = make;
        this.model = model;
    }
}
