package com.pluralsight;

public class Loops {
    public static void main(String[] args) {
        //Exploring the Land of Code-a-lot requires lots of repetitive actions!
        // For example, collecting 100 rainbow gems, fighting 5 grumpy trolls,
        // or knitting 3 cozy sweaters. Instead of writing the same code 100 times,
        // Winnie uses the "Repeat Action Spell," which is Java's Loop!
        //A Loop lets a block of code run over and over again until a specific
        // condition is met. We'll focus on the super common for loop.
        //The for loop has three main parts, like a magical chant:
        for (int gemCount = 1; gemCount <= 5; gemCount++) {
            // This code runs 5 times!
            System.out.println("Winnie collected Gem #" + gemCount + "!");
        }
        System.out.println("All gems collected! Time for a snack! 🍪");

        //Winnie has to defeat 3 Sparkle Slimes.
        // We need a for loop that repeats the "Fight" message three times.
        // The counter should start at 1 and go up to and including 3.
        // What would the three parts of the for loop's magical chant look like?
        // Write the entire loop!

        for (int defeatSlime = 1; defeatSlime <=3; defeatSlime++) { // code will run 3x
            System.out.println(defeatSlime + " Sparkle Slime defeated!");
        }
        System.out.println("Yay! All 3 slime defeated!");



    }
}
