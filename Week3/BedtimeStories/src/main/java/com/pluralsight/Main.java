package com.pluralsight;

import java.io.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // FileReader fileReader = new FileReader("poem.txt");
        boolean anotherStory = true;

        while (anotherStory) {
        System.out.println("Please enter a story name: (ex. Goldilocks.txt) ");
        String storyName = scanner.nextLine().trim().toLowerCase();

            try (BufferedReader reader = new BufferedReader(new FileReader(storyName))) {
                String line;
                int lineNum = 1;

                while ((line = reader.readLine()) != null) {
                    System.out.println(lineNum + ". " + line);
                    lineNum++;
                }
            } catch (FileNotFoundException e) {
                System.out.println("Sorry, that story name cannot be found.");
            } catch (IOException e) {
                System.out.println("Sorry, something went wrong.");
            }
            System.out.println("Would you like another story? (yes/no)");
            String yesOrNo = scanner.nextLine().trim().toLowerCase();
            if (!yesOrNo.equals("yes")) {
            anotherStory = false;}
        }



        }
    }
