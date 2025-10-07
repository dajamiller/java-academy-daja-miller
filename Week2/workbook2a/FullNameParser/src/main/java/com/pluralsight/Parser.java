package com.pluralsight;

import java.util.Scanner;

public class Parser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to full name parser!");

        System.out.println("Please enter your first name:");
        String firstname = sc.nextLine().trim();

        System.out.println("Please enter your middle name or N/A:");
        String middleName = sc.nextLine().trim();

        System.out.println("Please enter your last name:");
        String lastName = sc.nextLine().trim();

      //  String[] name = fullName.split(" ");
        System.out.println("First name: " + firstname.toUpperCase());

        if(middleName.contains("n/a")) {
            System.out.println("Middle name: (none)");
        } else {
            System.out.println("Middle name: " + middleName.toUpperCase());
        }
        System.out.println("Last name: " + lastName.toUpperCase());


        // if (middleName.equals(""""))
    

    }
}
