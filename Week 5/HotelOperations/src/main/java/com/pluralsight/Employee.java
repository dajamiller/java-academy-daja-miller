package com.pluralsight;

public class Employee {

    private String employeeId;
    private String name;
    private String dept;
    private double payRate;
    private double hoursWorked;

    public Employee(String employeeId, String name, String dept, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.dept = dept;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public double getRegularHours() {
//        double payRate = this.payRate;
//        double hoursWorked = this.hoursWorked;
        //double regularPay = payRate * hoursWorked;
        if (this.hoursWorked <= 40) {
            return this.hoursWorked;
        } else {
            return 40;
        }
    }
    public double getOvertimeHours() {
        if (this.hoursWorked > 40) {
            return this.hoursWorked - 40;
        } else {
            return this.hoursWorked;
        }
    }




    public double getTotalPay() {
        double regularPay = this.payRate * this.hoursWorked;
        double overtimePay = (this.payRate * 1.5) * this.hoursWorked;
        return regularPay + overtimePay;
    }

}
