package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // in class recap for weeks 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Grade Checker"); // title
        // ask user to input exam score
        System.out.println("Please input your exam score (0-100):");
        int examScore = scanner.nextInt();
        //turn number to letter grades and output
        if (examScore >= 90) {
            System.out.println("You got an A on your exam!");
        } else if (examScore >= 80 && examScore < 90) {
            System.out.println("You got a B on your exam!");
        } else if (examScore >= 70 && examScore < 80) {
            System.out.println("You got a C on your exam!");
        } else if (examScore >= 60 && examScore < 70) {
            System.out.println("You got a D on your exam");
        } else {
            System.out.println("You got a F on your exam");
        }
        scanner.close();
    }
}