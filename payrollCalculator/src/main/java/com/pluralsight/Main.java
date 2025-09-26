package com.pluralsight;

import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //step 1

        Scanner scanner = new Scanner(System.in);
        System.out.println("*Payroll Calculator*");
        //input name, hours worked, and payrate
        System.out.println("Enter your name:");
        String employeeName = scanner.nextLine();
        System.out.println("Enter your hours worked:");
        float hoursWorked = scanner.nextFloat();
        System.out.println("Enter your payrate:");
        float payRate = scanner.nextInt();
        //calculate
        float grossPay =  hoursWorked * payRate;

        //output
        System.out.println(employeeName + ", your gross pay is $" + grossPay);

    }
}
