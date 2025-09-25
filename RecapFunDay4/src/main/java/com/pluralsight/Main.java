package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


            String movieName = "The Conjuring";
            int numberFriends = 4;
            double pizzaPrice = 10.99; // one individual pizza
            double pizzaTotalPrice = pizzaPrice * (1 + numberFriends);
            boolean havePopcorn = false ;

            System.out.println("We're watching " + movieName + " with " + numberFriends + " friends. Pizza costs $" + pizzaPrice + " each.");
            System.out.println("The pizza total price is $" + pizzaTotalPrice);
            if (havePopcorn) {
                System.out.println("Popcorn time!");
            } else if (!havePopcorn) {
                System.out.println("Sorry, we don't have popcorn :(");

            }
    }
}