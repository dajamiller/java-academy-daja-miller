package com.pluralsight;

public class PowerpuffGirl {

    //info to store - name, health...
    // instance variables (typically hidden)
    private String name;
    private int health;
    private String outfitColor;
    private int takeDamage;
    private int power;

    //Consutructor (parameters with a _name)
    public PowerpuffGirl(String _name, String _outfitColor) {
        this.name = _name;
        this.outfitColor = _outfitColor;
        this.power = 100; // default values
        this.health = 100; // default values
        this.takeDamage = 100; // default values
    }


    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;

    }

    public void setHealth(int _newHealth) {
        if (_newHealth > 0 && _newHealth < 100) {
            this.health = _newHealth;
        } else {
            System.out.println("Not possible " + _newHealth + " is out of range");
        }
    }

    public void heal(int _howMuchHealth) {
        System.out.println("Drinking potion");
        //We cant be above 100

        int newHealth = this.health + _howMuchHealth;
        if (newHealth == 100) {
            this.setHealth(100);
            System.out.println("Fully recovered");
        } else {
            setHealth(newHealth);
        }
    }

    public void takeDamage(int _damage) {

        // set attack damage
        int newHealth = this.health - _damage;
        if (newHealth < this.health) {
            System.out.println("Ow, that hurt :(");
        }
        this.health = newHealth;
    }

}


