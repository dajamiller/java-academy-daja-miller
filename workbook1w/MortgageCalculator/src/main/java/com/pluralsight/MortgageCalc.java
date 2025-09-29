package com.pluralsight;

import java.util.Scanner;

public class MortgageCalc {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        //welcome
        System.out.println("Welcome to your mortgage calculator!");
        //enter loan amount
        System.out.println("Please enter your loan amount (00.00):");
        double loanAmount = myScanner.nextDouble();
        //enter number of years
        System.out.println("Please enter the number of years for your loan:");
        int numYears = myScanner.nextInt();
        //enter interest rate
        System.out.println("Please enter the annual interest rate for your loan:");
        double annualRate = myScanner.nextDouble();

        //pre-calculation
        double monthlyInterest = (annualRate / 12);
        double numMonthlyPayments = (numYears * 12);

        //calculations



        //output result
        System.out.println("Your monthly payment is $" + monthlyPayment + " and your total interest is $" + totalInterest );
    }
}
