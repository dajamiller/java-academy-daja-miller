package com.pluralsight;

import java.util.Scanner;

public class Room {

    private int numberOfBeds;
    private static double price;
    private boolean isOccupied;
    private boolean isDirty;
    private boolean isAvailable;

    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty, boolean isAvailable) {
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;

        // if not dirty
        //return " is clean"; //does not need to be displayed?
    }

    public void isAvailable() {
    if (isDirty || isAvailable ) {
        this.isAvailable = false;
    }
    }

    public static void roomSelection() {

        boolean running = true;

        while (running) {
            System.out.println("Welcome to the Room Selection!");
            System.out.println("Would you like a king or double room?");
            Scanner scanner = new Scanner(System.in);
            String roomSelection = scanner.nextLine().trim().toLowerCase();
            switch (roomSelection) {
                case "king" -> {

//                    price = 139;
//                    System.out.println("You have selected the room selection: " + roomSelection + " for $" + price + " per night.");
//                    running = false;

                    break;
                }
                case "double" -> {
//                    price = 124;
//                    System.out.println("You have selected the  room selection: " + roomSelection + " for $" + price + " per night.");
//                    running = false;
                    break;

                }
                default -> {
                    System.out.println("Invalid choice, try again");

                }
            }
        }

    }

}

