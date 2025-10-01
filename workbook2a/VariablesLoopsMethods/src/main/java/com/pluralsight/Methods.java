package com.pluralsight;

public class Methods {
    public static void main(String[] args) {
    }

    public static void superHeal(int healthToAdd) {
        System.out.println("✨ Super Healing spell cast!");
        System.out.println("Adding " + healthToAdd + " to Winnie's Health.");
        // Calling the method to heal 50 points
        superHeal(50);
    }
}

