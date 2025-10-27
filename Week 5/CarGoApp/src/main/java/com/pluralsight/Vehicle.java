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


    public void VehicleInfo(int vin, int year, String make, String model,  String vehicleType, String color, int odometer, double price) {
        this.vin = vin;
        this.year = year;
        this.make = make;
        this.model = model;
        this.vehicleType = vehicleType;
        this.color = color;
        this.price = price;
        this.odometer = odometer;
    }

    public int getVehicleByVin() {
        return vin;
    }

    public int getVehicleByYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }
    public int getOdometer() {
        return odometer;
    }
}
