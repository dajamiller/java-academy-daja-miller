package com.pluralsight;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("\nWelcome to Address Builder!\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your full name: ");
        String fullName = scanner.nextLine().trim();

        //billing info
        System.out.println("Enter your billing street (ex. 123 Main St.): ");
        String billingStreet = scanner.nextLine().trim();
        System.out.println("Enter your billing city (ex. San Diego): ");
        String billingCity = scanner.nextLine().trim();
        System.out.println("Enter your billing state (ex. CA):");
        String billingState = scanner.nextLine().trim();
        System.out.println("Enter your billing zipcode (ex.92120: ");
        String billingZip = scanner.nextLine().trim();

        //shipping info
        System.out.println("Next, enter your shipping street: ");
        String shippingStreet = scanner.nextLine().trim();
        System.out.println("Enter your shipping city: ");
        String shippingCity = scanner.nextLine().trim();
        System.out.println("Enter your shipping state: ");
        String shippingState = scanner.nextLine().trim();
        System.out.println("Enter your shipping zipcode: ");
        String shippingZip = scanner.nextLine().trim();



        // call info
        System.out.println("**Customer Information**");
        //
        AddressBuilder address = new AddressBuilder(fullName, billingStreet, billingCity, billingState, billingZip, shippingStreet, shippingCity, shippingState, shippingZip);
        System.out.println(address.formatAddress());












    }
}