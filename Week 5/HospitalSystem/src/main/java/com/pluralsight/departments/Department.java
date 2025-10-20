package com.pluralsight.departments;

public class Department {
    private String name;
    private String headOfDepartment;

    public Department(String department, String s) {
        name = department;
        headOfDepartment = s;
    }

    public String getInfo(){
        return name + " (Head:  " + headOfDepartment + ")";
    }
}
