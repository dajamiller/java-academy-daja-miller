package com.pluralsight;

public class Person {

    private String name;
    private int age;


    public Person(String name) {
        this.name = name;
        System.out.println("I've created from the super class PErson");
    }





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Hi my name is" + name + "and I'm " + age + " year's old");
    }


}
