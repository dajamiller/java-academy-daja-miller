package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        try {
            FileReader fileReader = new FileReader("employees.csv");
            BufferedReader bufReader = new BufferedReader(fileReader);
            String line;
            int lineNumber = 1;

            while ((line = bufReader.readLine()) !=null) {
                String [] parts = line.split("\\|");
                double hoursWorked = Double.parseDouble(parts[2]);
                double payRate = Double.parseDouble(parts[3]);

                Employee emp = new Employee(parts[0], parts[1],hoursWorked, payRate);

                System.out.printf(getEmployeeName() getEmployeeId() getGrossPay);

            }
            bufReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("Sorry, that file could not be found.");
        } catch (IOException e) {
            System.out.println("Sorry, something went wrong.");



        }
    }
}