package com.company;

public class Items {
    String name;
    String description;
}

/** Potions */

class Potion extends Items{

    double price;
    int healingValue;


    void use(){

        System.out.printf("you used %s \n",this.toString());
    }

    @Override
    public String toString() {
        return this.getClass().toString().substring(18);
    }
}

class RegularPotion extends Potion{
    @Override
    void use() {
        super.use();
        System.out.printf("You don't feel much better \n");
    }
}

class SuperPotion extends Potion{

    @Override
    void use() {
        super.use();
        System.out.println("You feel a bit better");
    }
}

class HyperPotion extends Potion{

    @Override
    void use() {
        super.use();
        System.out.printf("You feel much better! \n");
    }
}







/** Pokeballs **/

class Pokeball extends Items{

    int captureRate;

    @Override
    public String toString() {
        return this.getClass().toString().substring(18);
    }

    void capture(){
        System.out.println("you threw a "+this.toString()+" ! \n");
    }

}

class RegularBall extends Pokeball{


}

class GreatBall extends Pokeball{


}

class UltraBall extends Pokeball{

    @Override
    void capture() {
        System.out.printf("you threw an %s !", this.toString());
        System.out.println("Odds are looking pretty good!");
    }
}

class MasterBall extends Pokeball{

    @Override
    void capture() {
        super.capture();
        System.out.printf("It'll never miss!");
    }
}