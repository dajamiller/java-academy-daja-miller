package com.pluralsight;

public class Reservation {
    // create backing variables
    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean isWeekend;
    private double reservationTotal;

    public Reservation(String roomType, double price, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.price = price;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
        this.reservationTotal = 0;
    }


    public String getRoomType() {
        return roomType;
    }
    public String setRoomType() {
        return roomType;
    }
    public double getPrice() {
        return price;
    }
    public int getNumberOfNights() {
        return numberOfNights;
    }


}
