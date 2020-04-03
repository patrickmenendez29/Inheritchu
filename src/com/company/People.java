package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class People {
    String name;
    String description;

    public People(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void greet(){

        System.out.printf("Hi, I'm "+name+"!");
    }

    @Override
    public String toString() {
        return this.name;
    }
}

class Trainer extends People{


    public Trainer(String name, String description) {
        super(name, description);
    }

    @Override
    public void greet() {
        super.greet();
        System.out.printf("Lets battle!");
    }
}

class Nurse extends People{


    public Nurse(String name, String description) {
        super(name, description);
    }

    @Override
    public void greet() {
        super.greet();
        System.out.printf("Need some healing?");
    }
}

class ShopKeeper extends People{
    HashMap<Items,Integer> inventory;

    public ShopKeeper(String name, String description, HashMap<Items,Integer> inventory) {
        super(name, description);
        this.inventory = inventory;
    }

    public void setInventory(HashMap<Items, Integer> inventory) {
        this.inventory = inventory;
    }

    @Override
    public void greet() {
        super.greet();
        System.out.printf("Need to buy anything?");
    }
}


