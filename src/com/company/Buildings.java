package com.company;

public class Buildings {
    String name;
    String Description;
    String city;

    public Buildings(String name,String city,  String description) {
        this.name = name;
        Description = description;
        this.city = city;
    }

    void greet(){

        System.out.printf("Welcome!");
    }
}

class PokemonCenter extends Buildings{
 String City;

    public PokemonCenter(String name,String city,  String description) {
        super(name, city, description);
    }

    @Override
    void greet() {
        super.greet();
        System.out.printf("May we heal your Pokemon?");
    }
}

class Pokemart extends Buildings{
    String Region;

    public Pokemart(String name, String city, String description) {
        super(name, city, description);
    }


    @Override
    void greet() {
        super.greet();
        System.out.printf("Can I interest you in our latest inventory?");
    }
}







