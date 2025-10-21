package com.pluralsight;

public class Reservation {
    // create backing variables
    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean isWeekend;
    //private double reservationTotal;// does not need backing variable

    public Reservation(String roomType, double price, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.price = price;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
        //this.reservationTotal = 0;
    }


    public String getRoomType() {
        return "You have reserved a " + roomType + "room.";
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
    public double getReservationTotal() {
        return price * numberOfNights;
    }


}
