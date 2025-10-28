package com.pluralsight;

public class Teacher extends Person{

    public Teacher(String name) {
        super(name);
    }

    void canDo(){
        System.out.println("Teach Java");
    }
}
