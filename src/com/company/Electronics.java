package com.company;

public class Electronics {
    String name;
    String Descrition;
    String battery;
    String wattage;
    People owner;

    public Electronics(String name, People owner, String battery, int wattage){
        Descrition = "A device belonging to " + name;
        this.name = name;
        this.owner = owner;
        this.battery = battery;
        this.wattage = String.format("%sw",wattage);
    }

    void powerOn(){
        System.out.printf("Powering on device");
    }
}

class Pokedex extends Electronics{

    public Pokedex(String name, People owner, String battery, int wattage) {
        super(name, owner, battery, wattage);

        Descrition += "\n This device is used to keep track of encountered pokemon.";
    }

    @Override
    void powerOn() {
        super.powerOn();
        System.out.printf("Loading Pokedex");
    }
}

class Pokeputer extends Electronics{

    public Pokeputer(String name, People owner, String battery, int wattage) {
        super(name, owner, battery, wattage);
        Descrition += "\n This device is used for many common activities such as email";
    }

    @Override
    void powerOn() {
        super.powerOn();
        System.out.printf("Booting into computer");
    }
}
