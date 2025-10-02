package com.pluralsight;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // user input full name
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please enter your first name: ");
        String firstName = scanner.nextLine().trim().toUpperCase();
        System.out.println(" Please enter your last name: ");
        String lastName = scanner.nextLine().trim().toUpperCase();

        // input number of tickets
        System.out.println("How many tickets are in your reservation?: ");
        int tickets = scanner.nextInt();




    }
}