package com.robvega.pokemon;

import java.util.ArrayList;

public class Pokedex extends AbstractPokemon {
    private ArrayList<Pokemon> pokemonArrayList;

    public Pokedex() {
        this.pokemonArrayList = new ArrayList<>();
    }
    public Pokedex(ArrayList<Pokemon> pokemonArrayList) {
        this.pokemonArrayList = pokemonArrayList;
    }

    public void listPokemon() {
        for (Pokemon pokemon:
             pokemonArrayList) {
            System.out.println(pokemon.getName());
        }
    }

    public void addPokemon(Pokemon pokemon) {
        this.pokemonArrayList.add(pokemon);
    }
}
