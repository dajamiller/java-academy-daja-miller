package com.pluralsight;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // prompt input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Who Won? Lets find out!");
        System.out.println("Please enter score in this format: HomeTeam:VisitingTeam|00:00");
        String scoreInput = scanner.nextLine().trim();
        //split teams from scores
        String [] parts = scoreInput.split("\\|");
        String [] teamNames = parts[0].split(":");
        String [] scoreValues = parts[1].split(":");
        // assign variables
        String homeTeam = teamNames[0];
        String visitorTeam = teamNames[1];


        //split scores
        int homeScore = Integer.parseInt(scoreValues[0]);
        int visitorScore = Integer.parseInt(scoreValues[1]);


        // winner
        //if else, tie + winners

        if (homeScore == visitorScore) {
            System.out.println("It's a tie!");
        } else if (homeScore > visitorScore) {
            System.out.println(homeTeam + " Won!");
        } else if (visitorScore > homeScore) {
            System.out.println(visitorTeam + " Won!");
        }

        }
    }
