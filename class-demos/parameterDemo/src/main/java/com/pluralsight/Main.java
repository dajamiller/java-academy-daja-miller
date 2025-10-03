package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Hi("Bilal"); // Call the function -> It runs that piece of code. Benefits of reuse
        Hi("Nazik");
        Hi("Zak");

// I grab the SenzuBean ->
        IncreasePowerLevel(400);
    }

    public static void Hi(String name) {
        System.out.println("I wish you a warm welcome " + name);
    }

    public static int IncreasePowerLevel(int powerlevel) {
        System.out.println("The power level has been increased with " + powerlevel);

    }
}
