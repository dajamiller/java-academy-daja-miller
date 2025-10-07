package com.pluralsight;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Modify the for loop to print only even numbers.
        System.out.println("\nFor Loop: Counting even numbers up to 10");
        int i = 0;
        for (i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Even iteration " + i);
            }
        }

        //Change the while loop into a countdown timer.
        System.out.println("\nCountdown Timer");
        int j = 20;
        while (j > 0) {
            System.out.println(j + " secondss left.");
            Thread.sleep(1000);
            j--;
        }
        //Add a do...while loop that asks the user for input until they type "exit".
        System.out.println("\nDo...While Loop: Run at least once");
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.println("Type exit to end");
            String input = scanner.nextLine();
        } while (!information.equalsIgnoreCase("exit"));
        System.out.println("Thank you.");
        scanner.close();



    }
}