package com.pluralsight;

import java.time.LocalDate;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // user input full name
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Grand Lake Theatre. \nWhen you are ready to make a reservation, please fill out the form below.");
        System.out.println("Please enter your first name: ");
        String firstName = scanner.nextLine().trim();
        System.out.println("Please enter your last name: ");
        String lastName = scanner.nextLine().trim();
        // how to format names with capitalized first letter
        if (firstName.length() > 0 && lastName.length() > 0) {
            firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
            lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);

        }

        // input reservation date (mm/dd/yyyy)
        System.out.println("Please enter your desired reservation date (MM/DD/YYYY): ");
        String reservationDate = scanner.nextLine().trim();

        // how to parse date to be output as Month, Day, Year??
        // LocalDate reservationDate = LocalDate.parse(reservationDate);
        while (!reservationDate.endsWith("2025")) {
            System.out.println("Please enter a valid date (MM/DD/YYYY): ");
            reservationDate = scanner.nextLine().trim();
            if (reservationDate.length() == 10) {
                System.out.println("Please enter a valid date (MM/DD/YYYY): ");
                reservationDate = scanner.nextLine().trim();

            }
        }

            // input number of tickets
            System.out.println("How many tickets would you like to reserve?: ");
            int ticketNumber = scanner.nextInt();
            while (ticketNumber < 1) {
                System.out.println("Please enter a valid ticket number: ");
            }

            // output reservation details


            // if one ticket, no "s"
            if (ticketNumber == 1) {
                System.out.println("Thank you, you have " + ticketNumber + " ticket reserved for " + reservationDate + " under " + lastName + ", " + firstName);
            } else if (ticketNumber >= 2) {
                System.out.println("Thank you, you have " + ticketNumber + " tickets reserved for " + reservationDate + " under " + lastName + ", " + firstName);
            }
        }
    }




