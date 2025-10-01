package com.pluralsight;

public class SuperSaiyan {

    String name;
    int powerlevel;

    public void PowerUp(){
        this.powerlevel = this.powerlevel *2;
    }

    public void Stats() {
        System.out.println(this.name + "'s powerlevel is " + this.powerlevel);
        if(this.powerlevel > 9000)
        {
            System.out.println("Vegeta shouts: ITS OVER 9000!");
        }
    }
    public void Attack(SuperSaiyan _anySaiyan) {
        _anySaiyan.powerlevel = _anySaiyan.powerlevel -100;
    }

    public void Heal() {
        this.powerlevel = this.powerlevel + 200;
    }

    public void Destroy(SuperSaiyan _anySaiyan) {
        _anySaiyan.powerlevel = _anySaiyan.powerlevel = 0;
    }
    public void SenzoBean() {
        if (this.powerlevel < 1 ) {

        }
    }
}