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

    public double getPricePerNight() {
        if (this.roomType.equals("king")) {
            return 139;
        } else {
            return 124;
        }
    }

    public int getNumberOfNights() {
        return this.numberOfNights;
    }

    public double getReservationTotal() {
        double pricePerNight = this.getPricePerNight();
        if (this.isWeekend) {
            pricePerNight = this.getPricePerNight() * 1.10;
        }
        return pricePerNight * this.numberOfNights;
    }
}
