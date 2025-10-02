package com.pluralsight;

import java.time.LocalDate;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // user input full name
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first name: ");
        String firstName = scanner.nextLine().trim();
        System.out.println("Please enter your last name: ");
        String lastName = scanner.nextLine().trim();
        if (firstName.length() > 0) {
            firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);

        }

        String formattedFirstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
        // how to format names with capitalized first letter


        // input reservation date (mm/dd/yyyy)
        System.out.println("Please enter your desired reservation date (MM-DD-YYYY): ");
        String reservationDate = scanner.nextLine().trim();
        // LocalDate reservationDate = LocalDate.parse(reservationDate);
        while (!reservationDate.endsWith("2025")) {
            System.out.println("Please enter a valid date (MM-DD-YYYY): ");
            reservationDate = scanner.nextLine().trim();
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
                System.out.println(ticketNumber + " ticket reserved for " + reservationDate + " under " + lastName + ", " + firstName);
            } else if (ticketNumber >= 2) {
                System.out.println(ticketNumber + " tickets reserved for " + reservationDate + " under " + lastName + ", " + firstName);
            }
        }
    }




