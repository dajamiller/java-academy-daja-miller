package com.pluralsight;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String productCode = "ACME-12213";
        int dashPosition = productCode.indexOf("-"); //4

        System.out.println(dashPosition);
        String vendor = productCode.substring(0, dashPosition);  // cut the text between 0 and 4 characters
        System.out.println(vendor);
        String productNum = productCode.substring(dashPosition + 1);
        System.out.println(productNum);


        String firstname = "Nazik";
        String partOfTheName = firstname.substring(2);
        System.out.println(partOfTheName);
/// ////////
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your company email address:");
        String email = scanner.nextLine();

        boolean validEmail = ValidateEmail(email);
        if (validEmail) {
            System.out.println("Email is valid.");
        } else {
            System.out.println("Email is invalid.");
        }
    }
        public static boolean ValidateEmail(String email) {
            return email.endsWith("@my.yearupunited.org");
        }


    }
