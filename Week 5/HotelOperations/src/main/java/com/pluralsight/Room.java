package com.pluralsight;

public class Room {

    private int numberOfBeds;
    private boolean isOccupied;
    private boolean isDirty;
    // private boolean isAvailable;// backing not needed

    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty) {
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return this.getPrice();
    }
//        double price = 0;
//        if (this.roomType.equals("king")) {
//            price = 139;
//            return price;
//        } else (this.roomType.equals("double")) {
//            price = 124
//            return price;
//        }


    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return this.isDirty;

        // if not dirty
        //return " is clean"; //does not need to be displayed?
    }

    public boolean isAvailable() {// not backed by a variable
        if (this.isDirty || this.isOccupied) {
            return true;
        } else {
            return false;
        }
    }
    public String checkIn() {
        this.isOccupied = true;
        this.isDirty = true;
        return "Guest is checked in!";
        }
    public String checkOut() {
        this.cleanRoom();
        this.isOccupied = false;
        return "Room needs cleaning!";
    }
    public void cleanRoom() {

    }

    //public static void roomSelection(){}
}



//        boolean running = true;
//
//        while (running) {
//            System.out.println("Welcome to the Room Selection!");
//            System.out.println("Would you like a king or double room?");
//            Scanner scanner = new Scanner(System.in);
//            String roomSelection = scanner.nextLine().trim().toLowerCase();
//            switch (roomSelection) {
//                case "king" -> {
//
////                    price = 139;
////                    System.out.println("You have selected the room selection: " + roomSelection + " for $" + price + " per night.");
////                    running = false;
//
//                    break;
//                }
//                case "double" -> {
////                    price = 124;
////                    System.out.println("You have selected the  room selection: " + roomSelection + " for $" + price + " per night.");
////                    running = false;
//                    break;
//
//                }
//                default -> {
//                    System.out.println("Invalid choice, try again");
//
//                }
//            }


