package com.pluralsight;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException {
        int j = 0;
        for (int j = 10; j >= 1; j--); {
            System.out.println(j);
            Thread.sleep(1000);
        }
    }
}
