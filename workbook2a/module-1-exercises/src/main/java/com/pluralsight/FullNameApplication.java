package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        System.out.println("\nWelcome to Full Name Generator");
        Scanner sc = new Scanner(System.in);
        // first name input
        System.out.println("Please enter your first name: ");
        String firstName = sc.nextLine().trim();
        System.out.println("Please enter your middle name or press enter: ");
        String middleName = sc.nextLine().trim();
        System.out.println("Please enter your last name: ");
        String lastName = sc.nextLine().trim();
        System.out.println("Please enter your suffix or press enter: ");
        String suffix = sc.nextLine().trim();
        // full name output
        System.out.println(firstName + " " + middleName + " " + lastName + " " + suffix);



    }
}
