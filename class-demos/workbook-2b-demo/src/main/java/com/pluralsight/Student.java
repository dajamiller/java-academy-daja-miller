package com.pluralsight;

public class Student {

    // Instance
    private String name;
    private int id;
    private String grade;

    // what is final for?
    private static final int MAX_DURATION_IN_YEARS = 5;
    // constructor - right click

    public Student(String _name, int _id, String _grade) {
        this.name = _name;
        this.gradeLevel = _grade;
        this.id = _id;
    }

    @Override
    public String toString() {
        return "Student name: ";
    }


}
