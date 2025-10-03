package com.pluralsight;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //================
        // 1. STRINGS
        // ================
        System.out.println("=== STRINGS ===");

        //String methods - length, uppercase, lowercase, char
        String name = "Daja";
        System.out.println("Hello, " + name); // Concatenation

        // String methods
        System.out.println("Length of name: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("LowercASE: " + name.toLowerCase());
        System.out.println("First letter: " + name.charAt(0));   //R
        System.out.println("Does it contain 'ja'? -" + name.contains("ja"));// true or false
        // practice - movie title
        String favMovie = "mean girls";
        System.out.println("Uppercase: " + favMovie.toUpperCase());

        // types of loops
        // counter - 1 to 5
        System.out.println("counter");
        for (int counter = 1; counter <= 5; counter++) {
            System.out.println("Number: " + counter);
        }
        // FOR loop
        for (int i = 0; i < 5; i++) {
            System.out.println("You guys are cool!");
        }
        // For loop;

        for (int i = 0; i < 3; i++) {
            System.out.println("Move forward!");
        }

        // While loop
        System.out.println("\nWhile loop example:");
        int counter = 30;
        while (counter > 0) {
            System.out.println("Counter is: " + counter);
            counter--; // decrease by 1
        }
        // Example 2b
        // While loop
        System.out.println("\nPlease enter password:");
        Scanner read = new Scanner(System.in);

        boolean passwordIncorrect = true;
        String password = "1234";
        String enterPassword = "";

        while (passwordIncorrect == true) {
            System.out.println("What is the password?");
            enterPassword = read.nextLine();
            if(!enterPassword.equals(password)) {
                System.out.println("Incorrect");
            } else {
                passwordIncorrect = false;
            }

        }
        // Do-while loop
        System.out.println("\nDo-while loop example:");
        int x = 0;
        do {
            System.out.println("x is: " + x);
            x++;
        } while (x < 3);
        // Create a loop that will display:
        //"I will be a good developer"

        for (int i = 0; i < 10; i++) {
            System.out.println("I will be a good developer!");
        }

        // add numbered list to counter
        int ex2counter = 1;
       do  {
            System.out.println(ex2counter + ". I will be a good developer!");
            ex2counter++;
        } while (ex2counter <= 10);
        // class ex 2
        System.out.println("\nYear Up LTCA Countdown:");
        int ltcaCounter = 81;
        while (ltcaCounter > 0) {
            System.out.println(ltcaCounter + " more day left at Year Up Code Academy!");
            ltcaCounter--; // decrease by 1
        }

        // bilal's example from class
        //question- how %2d??
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%2d. I will be a good developer%n", i);
        }


    }

}
