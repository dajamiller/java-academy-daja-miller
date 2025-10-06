package com.pluralsight;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void display(CellPhone phone) {
        System.out.println("--- Cell Phone Information ---");
        System.out.println("Owner: " + phone.getOwnerName());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Serial: " + phone.getSerialNumber());
        System.out.println("------------------------------");
    }

    public static void main(String[] args) {

        // create object
        CellPhone cellPhone1 = new CellPhone();
        // use scanner to ask for details
        System.out.println("Welcome to CellPhone Info Retrieval Tool!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("To get started, Please enter your phones serial number (10-12 digits): ");
        String serialNumber = scanner.nextLine().trim();
        System.out.println("Next, enter your phone model (ex. iPhone X): ");
        String model = scanner.nextLine().trim();
        System.out.println("Who is your phone carrier? (ex. T-Mobile):");
        String carrier = scanner.nextLine().trim();
        System.out.println("Please enter your phone number (ex. 281-330-8004)");
        String phoneNumber = scanner.nextLine().trim();
        System.out.println("Please enter the cell phone owner's name (ex. Mike Jones): ");
        String ownerName = scanner.nextLine().trim();

        // store values in object - using setters
        cellPhone1.setOwnerName(ownerName);
        cellPhone1.setPhoneNumber(phoneNumber);
        cellPhone1.setCarrier(carrier);
        cellPhone1.setModel(model);
        cellPhone1.setSerialNumber(serialNumber);

        CellPhone cellPhone2 = new CellPhone(
                "Solja Boy",// model
                "678-999-8212", // phone Number
                "T-mobile", // carrier
                "Sidekick", // model
                "2345678" //serialNumber
        );
        System.out.println("*** Display Both Phone Stats ***");
        display(cellPhone1);
        display(cellPhone2);

        System.out.println("Test Call 1: " + cellPhone1.getOwnerName() + " calling " + cellPhone2.getOwnerName());
        cellPhone1.dial(cellPhone2.getPhoneNumber());

        System.out.println("Test Call 2: " + cellPhone2.getOwnerName() + " calling " + cellPhone1.getOwnerName());
        cellPhone2.dial(cellPhone1.getPhoneNumber());

        // close scanner - good practice
        scanner.close();

    }
}

        // display stored info
        // System.out.println("\n\n**Here is your Cell Phone Information: \n");
        //System.out.println("Owner: " + ownerName + " \n" + "Carrier: " + carrier + " \n" + "Phone number: " + phoneNumber + " \n"  +  "Model: " + model + " \n" + "Serial Number: " + serialNumber);









