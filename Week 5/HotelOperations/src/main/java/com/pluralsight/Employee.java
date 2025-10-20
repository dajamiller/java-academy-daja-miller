package com.pluralsight;

public class Employee {

    private String employeeId;
    private String name;
    private String dept;
    private double payRate;
    private float hoursWorked;

    public Employee(String employeeId, String name, String dept, float payRate, float hoursWorked) {}

    public String getTotalPay() {
        return String.format("%.2f", payRate * hoursWorked);
    }

}
