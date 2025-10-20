package com.pluralsight.staff;

public class Doctor {
    private String name;
    private String specialization;

    public Doctor(String name, String specialization){
        this.name = name;
        this.specialization = specialization;
    }

    public void introduce() {
        System.out.println("\nDr. " + name + " - Specialization: " + specialization);
    }
}
