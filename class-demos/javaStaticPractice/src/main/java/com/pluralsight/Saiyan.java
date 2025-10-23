package com.pluralsight;

import java.util.ArrayList;

public class Saiyan {

    // instance variables
    private String name;
    private int powerLevel;

    // static variables - shared by all saiyans
    public static int totalSaiyans = 0;

    static ArrayList<Saiyan> allSaiyans = new ArrayList<Saiyan>();

    // constructor w/ parameter
    public Saiyan(String name, int powerLevel) {
        this.name = name;
        this.powerLevel = powerLevel;
        totalSaiyans++;             // adding a new one, not  using this. because any saiyan can call it
        allSaiyans.add(this);
    }

    // method (sets power level if over 0), belongs to 1 saiyan
    public void setPowerLevel(int powerLevel) {
        if (powerLevel > 0) {
            this.powerLevel = powerLevel;
        }
    }

    //public int getTotalSaiyans() {
    //    return totalSaiyans;
    // }
    // OR
    public static void showTotalSaiyans() {
        System.out.println("The total amount of saiyans is: " + totalSaiyans + "!");
    }

    //Show stats of any chosen saiyan
    public void showStats() {
        //non-static is values that belongs to the object
        // static means generic information not a particular saiyan or object.

        System.out.println("\nName: " + this.name);
        System.out.println("Powerlevel: " + this.powerLevel);
    }
    public static void showAllSaiyansStats() {
        for(Saiyan s : allSaiyans)
        {
            s.showStats();
            }

        }
        public void fusionDance(String name1, String name2) {
        // add power levels of selected saiyans
        }

}


// use static when instances of variable not needed
// calculator example, calculator that adds, doesn't need multiple versions of itself
// if method acts o one individual object and not all - make non-static
