package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Room.roomSelection();
        Room room1 = new Room( 2, 129, true, false, false);
        System.out.println(room1.isOccupied());
        Room room2 = new Room( 1, 99, true, true, false);
        if (room2.isDirty()) {
            System.out.println("Clean the room!");
        }


    }
}