package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dice dice = new Dice();

        int roll1;
        int roll2;

        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;

        System.out.println("100 Dice rolls...");

        // for loop 1-100

        for (int i = 1; i <= 100; i++) {

            roll1 = dice.roll();
            roll2 = dice.roll();

            int sum = roll1 + roll2;

            // print value

            System.out.printf("Roll %d: %d - %d Sum: %d\n", i, roll1, roll2, sum);


            if (sum == 2) {
                twoCounter++;
            }
            if (sum == 4) {
                fourCounter++;
            }
            if (sum == 6) {
                sixCounter++;
            }
            if (sum == 7) {
                sevenCounter++;
            }
        }
        System.out.println("100 Roll Sum Tracker");
        System.out.println("Sum of 2 was rolled: " + twoCounter + " times.");
        System.out.println("Sum of 4 was rolled: " + fourCounter + " times.");
        System.out.println("Sum of 6 was rolled: " + sixCounter + " times.");
        System.out.println("Sum of 7 was rolled: " + sevenCounter + " times.");

    }
}