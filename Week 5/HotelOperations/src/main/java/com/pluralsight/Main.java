package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Room.roomSelection();
        Room room1 = new Room(2, 129, true, false);
        System.out.println(room1.isAvailable());

        Room room2 = new Room(1, 99, true, false);
        // if (room2.isDirty()) {
        //     System.out.println("Clean the room!");
        System.out.println(room2.isAvailable());


        Room room3 = new Room(1, 12, true, true);
        System.out.println(room3.isAvailable());

        Reservation rs1 = new Reservation("king", 0, 5, true);
        System.out.println(rs1.getReservationTotal());

        Employee emp1 = new Employee("123456", "Daja", "Admin", 29.36, 65);
        System.out.println(emp1.getTotalPay());



    }
}