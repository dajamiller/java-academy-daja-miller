package com.pluralsight;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // create object
        CellPhone cellPhone = new CellPhone();
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
        cellPhone.setOwnerName(ownerName);
        cellPhone.setPhoneNumber(phoneNumber);
        cellPhone.setCarrier(carrier);
        cellPhone.setModel(model);
        cellPhone.setSerialNumber(serialNumber);

        // display stored info
        System.out.println("\n\n**Here is your Cell Phone Information: \n");
        //System.out.println("Owner: " + ownerName + " \n" + "Carrier: " + carrier + " \n" + "Phone number: " + phoneNumber + " \n"  +  "Model: " + model + " \n" + "Serial Number: " + serialNumber);

        // return with getters
        System.out.println("Owner: " + cellPhone.getOwnerName());
        System.out.println("Phone: " + cellPhone.getPhoneNumber());
        System.out.println("Carrier: " + cellPhone.getCarrier());
        System.out.println("Model: " + cellPhone.getModel());
        System.out.println("Serial Number: " + cellPhone.getSerialNumber());

    }
}



