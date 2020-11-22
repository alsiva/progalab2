package ru.ifmo.se.pokemon.pokemons;

import ru.ifmo.se.pokemon.moves.Facade;
import ru.ifmo.se.pokemon.moves.Swagger;
import ru.ifmo.se.pokemon.moves.PoisonPowder;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Weepinbell extends Pokemon {
    public Weepinbell(String name, int level) {
        super(name, level);
        super.setType(Type.GRASS, Type.POISON);
        super.setStats(65, 90, 50, 85, 45, 55);

        Facade facade = new Facade();
        Swagger swagger = new Swagger();
        PoisonPowder poisonPowder = new PoisonPowder();

        super.setMove(facade);
        super.setMove(swagger);
        super.setMove(poisonPowder);
    }
}
