package ru.ifmo.se.pokemon.pokemons;

import ru.ifmo.se.pokemon.moves.Facade;
import ru.ifmo.se.pokemon.moves.Swagger;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Bellsprout extends Pokemon {
    public Bellsprout(String name, int level){
        super(name, level);
        super.setType(Type.GRASS, Type.POISON);
        super.setStats(50, 75, 35, 70, 30, 40);
        Facade facade = new Facade();
        Swagger swagger = new Swagger();

        super.setMove(facade);
        super.setMove(swagger);
    }
}
