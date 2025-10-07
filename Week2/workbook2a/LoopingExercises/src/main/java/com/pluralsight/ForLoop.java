package com.pluralsight;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Countdown to launch:");
        for (int f = 10; f >= 1; f--) {
            System.out.println(f);
            Thread.sleep(1000);
        }
        System.out.println("Launch!");
    }
}
