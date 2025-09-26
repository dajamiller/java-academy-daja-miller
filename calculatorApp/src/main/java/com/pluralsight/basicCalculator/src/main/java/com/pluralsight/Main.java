package com.pluralsight;

import java.util.*;
class basicCalculator
{
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
// get two numbers, add them together, and display the sum
        System.out.print("Enter first number: "); float firstNumber = myScanner.nextFloat();
        System.out.print("Enter second number: "); float secondNumber = myScanner.nextFloat();

        System.out.println("Available Caluclations:");
        System.out.println("(A) Addition");
        System.out.println("(S) Subtraction");
        System.out.println("(D) Division");
        System.out.println("(M) Multiplication");
        System.out.println("Please type an option: ");
        // operator choice
        String operatorChoice = myScanner.next().toUpperCase();
        float result;
        if (operatorChoice.equals("M")) {
            result = firstNumber * secondNumber;
            System.out.println(firstNumber + " * " + secondNumber + " = " + result);
        }



    }
}
