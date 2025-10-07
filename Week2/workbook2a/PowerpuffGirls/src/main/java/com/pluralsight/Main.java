package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // why we work with classes
        String Powerpuffgirlname = "Blossom";
        int health = 23456789;




        // what are we making?
        // Todo: A Powerpuff fighting game
            // application requirements
            // features
            // - play online, solo
            // - customize characters
            // - costumes
            // - finishing moves
            // - team attack
            // - dialogue
            // - health boost

        PowerpuffGirl blossom = new PowerpuffGirl("Blossom","pink");
        System.out.println(blossom.getHealth());
        blossom.setHealth(20);
        System.out.println(blossom.getHealth());
        blossom.heal(50);
        System.out.println(blossom.getHealth());
        blossom.takeDamage(20);
        System.out.println(blossom.getHealth());




        }

    }

