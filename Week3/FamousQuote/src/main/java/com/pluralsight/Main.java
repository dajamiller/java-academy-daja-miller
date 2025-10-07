package com.pluralsight;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" **Random Famous Quote Generator** ");
        String [] famousQuotes = {
                "Everybody dies, but not everybody lives - Aubrey Graham",
                "Dream Big - Oprah Winfrey",
                "Work Hard, Play Hard - Wiz Khalifa",
                "Just Do It - Nike",
                "The only thing we have to fear is fear itself - Franklin D. Roosevelt",
                "I have a Dream - Martin Luther King Jr.",
                "Follow the yellow brick road - The Wizard of Oz ",
                "Merry Christmas - Santa Claus",
                "Happy New Year - NY Times Square",
                "I'm Fergilicious - Fergie"};
        boolean keepGoing = true;
        while (keepGoing) {
        try {
            System.out.println("Enter a number 1-10 for a Random Quote:");
            int choice = scanner.nextInt();

            System.out.println("Your random quote: ");
            System.out.println(famousQuotes[choice - 1]);
        } catch (Exception e) {
            System.out.println("Sorry, that didn't work. Try again.");
        }
            System.out.println("Would you like to generate another quote? (yes or no): ");
            String yesOrNo = scanner.next().trim().toLowerCase();
            if (yesOrNo.equals("yes")) {
            keepGoing = true;
            } else {
                keepGoing = false;
            }
        }

        int randomIndex = (int)(Math.random() * famousQuotes.length);

    }
}