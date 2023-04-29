package com.robvega.pokemon;

import java.util.ArrayList;

public class PokemonTest {
    public static void main(String[] args) {
        Pokemon charmander = new Pokemon(
                "Charmander",
                39,
                "Fire");
        Pokemon squirtle = new Pokemon(
                "Squirtle",
                44,
                "Water");

        ArrayList<Pokemon> pokemonArrayList = new ArrayList<>();
        pokemonArrayList.add(charmander);
        pokemonArrayList.add(squirtle);

        charmander.attackPokemon(squirtle);
        System.out.println("Squirtle health: " + squirtle.getHealth());

        Pokedex pokedex = new Pokedex(pokemonArrayList);
        Pokemon pikachu = pokedex.createPokemon("Pikachu" , 35, "Electric");
        System.out.println(pokedex.pokemonInfo(pikachu));
        pokedex.addPokemon(pikachu);
        pokedex.listPokemon();

        System.out.println(charmander.getCount());
    }
}
