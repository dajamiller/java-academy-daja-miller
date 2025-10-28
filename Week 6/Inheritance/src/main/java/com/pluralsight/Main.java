package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher();
        t1.setName("Remsey");
        t1.setAge(30);

        Student s1 = new Student();
        s1.setName("Anthony");
        s1.canDo();
        s1.setAge(22);
    }
}
