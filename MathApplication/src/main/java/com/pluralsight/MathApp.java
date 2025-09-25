package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //exercise 3
        // Question 1:
        // declare variables here
        // then code solution
        // then use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        // REPEAT FOR NEXT EXERCISE

        //step 1

        // Question 1
        int bobSalary = 250000 ;
        int garySalary = 350000 ;
        int highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("The highest salary is: $" + highestSalary) ;

        //Question 2
        int carPrice = 25000 ;
        int truckPrice = 65000 ;
        int lowestPrice = Math.min(carPrice, truckPrice);

        System.out.println("The lowest price is $" + lowestPrice) ;

        //Question 3
        // circle area = pi r^2
        double circleRadius = 7.25 ;
        double circleArea = Math.PI * Math.pow(circleRadius, 2) ;
        System.out.println("The area of the circle is " + circleArea + " cm^2") ;

        //Question 4
        //square root
        int wholeNumber = 5 ;
        double squareRoot = Math.sqrt(wholeNumber) ;
        System.out.println("The square root of " + wholeNumber+ " is " + squareRoot) ;

        //Question 5
        int x1 = 5 ;
        int y1 = 10 ;
        int x2 = 85 ;
        int y2 = 50 ;
        double distanceBetween = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)) ;
        System.out.println("The distance between the points is " + distanceBetween) ;

        //Question 6
        double absVariable = -3.8 ;
        double absValue = Math.abs(absVariable) ;
        System.out.println("The absolute value of" + absVariable + " is " + absValue) ;

        //Question 7
        double randomNumber = Math.random() ;
        System.out.println("The random number is " + randomNumber) ;

        //Question 8
        int numberDays = 24 ;
        int hoursDay = 24 ;
        int minutesHour = 60 ;
        int minutesDay = numberDays * hoursDay * minutesHour ;
        System.out.println("There are " + minutesDay + " minutes in " + numberDays + " days") ;

    }
}

