package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        // Add your code here

        List<Person> people = new ArrayList<>();
        people.add(new Person("Lee", "Hamilton", 59));
        people.add(new Person("Guillermo", "Koch", 24));
        people.add(new Person("Matthew", "Quinn", 35));
        people.add(new Person("Tami", "Kramer", 63));
        people.add(new Person("Ana", "Middleton", 48));
        people.add(new Person("Therese", "Davis", 28));
        people.add(new Person("Wes", "Sanders", 31));
        people.add(new Person("Lucinda", "Brewer", 42));
        people.add(new Person("Adrian", "Lam", 17));
        people.add(new Person("Alyssa", "Peterson", 74));

        //name input
        System.out.print("~~~ Welcome to Name Search ~~~\n");
        Scanner myscanner = new Scanner(System.in);
        System.out.print("\nPlease enter the name you would like to search (first or last): \n");
        String searchName = myscanner.nextLine().toLowerCase().trim();

        List<Person> matches = new ArrayList<>();
        for (Person person : people) {
            if (person.getFirstName().toLowerCase().contains(searchName) || person.getLastName().toLowerCase().contains(searchName))
                matches.add(person);
        }
        System.out.println("\nThe following names are matched:\n");
        if (matches.isEmpty()) {
            System.out.println("No matches found.");
        } else {
            for (Person person : matches) {
            System.out.println(person.getFirstName() + " " + person.getLastName());
            }
        }


    }
}
