package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Saiyan s1 = new Saiyan("Kale", 5000);
        Saiyan sonic = new Saiyan("Sonic", 5000);
        Saiyan goku = new Saiyan("Goku", 5000);
        Saiyan s4 = new Saiyan("Vegeta", 5000);
        Saiyan s5 = new Saiyan("Brock", 9000);
        Saiyan s6 = new Saiyan("Mario", 1001);

        sonic.setPowerLevel(200);  //sonic.setPowerLevel();
        goku.setPowerLevel(5000); //goku.setPowerLevel();

//        Math.abs(-2200);
//
//        Math m1 = new Math();
        Saiyan.showTotalSaiyans();
        // ^^^ static method is connected and generic for all saiyans

        goku.showStats();

        Saiyan.showAllSaiyansStats();
    }
}

//True or False: A static method can directly access non-static (instance) variables.
//True or False: You can call a static method without creating an object of the class.
//True or False: Each object of a class gets its own copy of a static variable.
//True or False: Static methods belong to the class, not to any specific object.
//True or False: The main() method in Java must always be static.

1. false
2. true
3. false
4. true
5. true