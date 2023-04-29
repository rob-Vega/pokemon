package com.robvega.pokemon;

public abstract class AbstractPokemon implements PokemonInterface {
    public Pokemon createPokemon(String name, int health, String type) {
        return new Pokemon(name, health, type);
    }

    public String pokemonInfo(Pokemon pokemon) {
        return String.format("Pokemon:\n" +
                "name: %s\n" +
                "health: %d\n" +
                "type: %s", pokemon.getName(), pokemon.getHealth(), pokemon.getType());
    }
}
