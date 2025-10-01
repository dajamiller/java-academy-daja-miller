package com.pluralsight;

public class Loops {
    public static void main(String[] args) {
        // example

        for (int gemCount = 1; gemCount <= 5; gemCount++) {
            // This code runs 5 times!
            System.out.println("Winnie collected Gem #" + gemCount + "!");
        }
        System.out.println("All gems collected! Time for a snack! 🍪");
        //Winnie has to defeat 3 Sparkle Slimes.
        // We need a for loop that repeats the "Fight" message three times.
        // The counter should start at 1 and go up to and including 3.
        //What would the three parts of the for loop's magical chant look like? Write the entire loop!

        for (int defeatSlime = 1; defeatSlime <= 3; defeatSlime++) {
            System.out.println(defeatSlime + " Slime Defeated!");
        }
        System.out.println("Yay! All 3 Sparkle SLime have been defeated!");
        }
    }

