package com.pluralsight;

public class Employee {

    //instances
    private String employeeId;
    private String name;
    private double hoursWorked;
    private double payRate;

    //parameterized constructor
    public Employee(String employeeId, String name, double hoursWorked, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }


}
