package com.pluralsight;

import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //Primitive Variables
        int age = 28;
        double weight = 60.5;
        char firstLetter = 'D';
        boolean isHappy = true;
        boolean ateBreakfast = false;

// execrise mood & breakfast checker
        String firstname = "Daja";
        String lastname = "Miller";
        String fullName = firstname +  lastname;
        String favoriteColor = "Light Blue";
        String favoriteArtist = "Drake";
        String newfavoriteColor = "Black";

        System.out.println("My name is " + fullName);
        System.out.println("I am " + age + " years old. ");
        System.out.println("My favorite artist is " + favoriteArtist);
        System.out.println("My favorite color is " + favoriteColor);
        System.out.println("My new favorite color is " + newfavoriteColor);

        if (isHappy && ateBreakfast) {
            System.out.println("Great, you are fine.");
        }else if (!ateBreakfast && isHappy) {
            System.out.println("You could be hungry.");
        }else if (!ateBreakfast && !isHappy) {
            System.out.println("You should eat something.");
        }


        int vehicleIdentificationNumber = 1234567 ; //

        String vehicleMakeModel = "Nissan Altima" ;//

        String vehicleColor = "red" ;

        boolean towingPackage = true ;

        int odometerReading = 65000 ;

        double carPrice = 9877.23 ;

        char carRating = 'B' ;

        int phoneNumber = 1234567890 ;

        int socialSecurityNumber = 123457890 ;

        int zipCode = 12345 ;


    }
}