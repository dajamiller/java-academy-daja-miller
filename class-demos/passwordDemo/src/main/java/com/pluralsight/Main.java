package com.pluralsight;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your password: ");
        String password = scanner.nextLine();
        // conditional for if password is correct
        if (password.equals("1234")) {
            System.out.println("Correct password entered.");
        } else {
            System.out.println("Incorrect password entered.");
        }
    }
}