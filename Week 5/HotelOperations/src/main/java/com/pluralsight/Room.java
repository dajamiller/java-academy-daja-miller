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
        return price % 2;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isClean() {
        return isDirty;
    }

    public boolean isAvailable() {
        return isAvailable;
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
                    price = 139;
                    System.out.println("You have selected the room selection: " + roomSelection + " for $" + price + " per night.");

                    break;
                }
                case "double" -> {
                    price = 124;
                    System.out.println("You have selected the  room selection: " + roomSelection + " for $" + price + " per night.");
                    break;

                }
            }
        }

    }

}

