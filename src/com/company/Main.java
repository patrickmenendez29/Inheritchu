package com.company;


// Note: thanks for making all the class names of equal length :)

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here

   Trainer Red = new Trainer("red", "A trainer from palette town");
   Trainer Green = new Trainer("Green", "A trainer frmo palette town");
   ShopKeeper Victor = new ShopKeeper("Victor the vendor",
           " a vendor known for great deals", new HashMap<>());

   HashMap<Items, Integer> victorInventory = new HashMap<>();

   victorInventory.put(new Pokeball(),100);
   victorInventory.put(new GreatBall(),50);
   victorInventory.put(new UltraBall(), 5);
   victorInventory.put(new MasterBall(), 1);
   victorInventory.put(new RegularPotion(), 20);
   victorInventory.put(new SuperPotion(), 10);
   victorInventory.put(new HyperPotion(), 3);

   Victor.setInventory(victorInventory);

   Nurse NurseJoy = new Nurse("Nurse Joy",
           "Nobody knows if it is ever the same person or just a bunch of twins");

   Pokedex pokedex = new Pokedex("Pokedex", Red, "1 week", 80);

   Pokeputer pokeputer = new Pokeputer("Pokeputer", NurseJoy, "1 week",80);
    }

    PokemonCenter pokemonCenter = new PokemonCenter("Celadon Center",
            "Celadon City", "A popular rest for pokemon trainers in Celadon city");
    Pokemart Kmart = new Pokemart("K Mart","Southeast Kanto",
            "A large department store visited by many citizens of the surrounding towns");
}



