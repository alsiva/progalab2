package ru.ifmo.se.pokemon.pokemons;

import ru.ifmo.se.pokemon.moves.Facade;
import ru.ifmo.se.pokemon.moves.Swagger;
import ru.ifmo.se.pokemon.moves.SludgeBomb;
import ru.ifmo.se.pokemon.moves.PoisonPowder;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Victreebel extends Pokemon {
    public Victreebel(String name, int level) {
        super(name, level);
        super.setType(Type.GRASS, Type.POISON);
        super.setStats(80,105,65,100,70,70);

        Facade facade = new Facade();
        Swagger swagger = new Swagger();
        PoisonPowder poisonPowder = new PoisonPowder();
        SludgeBomb sludgeBomb = new SludgeBomb();

        super.setMove(facade);
        super.setMove(swagger);
        super.setMove(poisonPowder);
        super.setMove(sludgeBomb);
    }
}
