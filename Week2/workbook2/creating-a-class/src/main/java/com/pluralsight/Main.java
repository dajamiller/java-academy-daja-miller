package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       //\\

        ///

        // A class is a blueprint to create a type of object

       //

        SuperSaiyan ss1 = new SuperSaiyan();
        ss1.name = "Goku";
        ss1.powerlevel = 1000;

        SuperSaiyan ss2 = new SuperSaiyan();
        ss2.name = "Vegeta";
        ss2.powerlevel = 998;
        ss1.PowerUp();
        ss1.PowerUp();
        ss1.PowerUp();
        ss1.Attack(ss2);
        ss2.PowerUp();
        ss2.Attack(ss1);
        ss2.Heal();
        ss2.Heal();
        ss1.PowerUp();
        ss1.Destroy(ss2);


        ss1.Stats();
        ss2.Stats();
    }
}
