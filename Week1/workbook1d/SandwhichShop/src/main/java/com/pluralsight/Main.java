package com.pluralsight;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Rosie's Sandwhich Shop!");
        //step 1
        //input  sandwich choice , age for discount, and display cost
        String sandwich1name = "(P) Pastrami - $5.45";
        String sandwich2name = "(T) Tuna - $8.95";
        double sandwich1price = 5.45d;
        double sandwichPrice2 = 8.95d;
        double chosenPrice = 0;
        //prompt user select sandwich
        System.out.println("Please choose your sandwich (P or T):");
        System.out.println(sandwich1name);
        System.out.println(sandwich2name);

        String sandwichChoice = scanner.next().toUpperCase();

        if (sandwichChoice.equals("P")) {
            chosenPrice = sandwich1price;
        } else if (sandwichChoice.equals("T")) {
            chosenPrice = sandwichPrice2;
        } else {
            System.out.println("Sorry, that sandwich is not a valid choice.");
            return;

        }

        //prompt user age
        System.out.println("What is your age?");
        int userAge1 = scanner.nextInt();
        double discount = 0;

        //calculations
        if (userAge1 <= 17) {
            discount =  chosenPrice* 0.1; //10% discount
        } else if (userAge1 > 17 && userAge1 <= 64) {  //no discount
            discount = chosenPrice* 0;
        } else {
            discount = chosenPrice * 0.2; //20% discount
        }

        //final calculaton

    }
}