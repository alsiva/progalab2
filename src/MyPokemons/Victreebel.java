package MyPokemons;

import MyMoves.Bellsprout.Facade;
import MyMoves.Bellsprout.Swagger;
import MyMoves.Victreebel.SludgeBomb;
import MyMoves.Weepinbell.PoisonPowder;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Victreebel extends Pokemon {
    public Victreebel(String name, int level) {
        super(name, level);
        super.setType(Type.GRASS, Type.POISON);
        super.setStats(80,105,65,100,70,70);

        Facade facade = new Facade(70, 100);
        Swagger swagger = new Swagger(0, 85);
        PoisonPowder poisonPowder = new PoisonPowder(0, 75);
        SludgeBomb sludgeBomb = new SludgeBomb(90, 100);

        super.setMove(facade);
        super.setMove(swagger);
        super.setMove(poisonPowder);
        super.setMove(sludgeBomb);
    }
}
