package MyPokemons;

import MyMoves.Bellsprout.Facade;
import MyMoves.Bellsprout.Swagger;
import MyMoves.Weepinbell.PoisonPowder;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Weepinbell extends Pokemon {
    public Weepinbell(String name, int level) {
        super(name, level);
        super.setType(Type.GRASS, Type.POISON);
        super.setStats(65, 90, 50, 85, 45, 55);

        Facade facade = new Facade(70, 100);
        Swagger swagger = new Swagger(0, 85);
        PoisonPowder poisonPowder = new PoisonPowder(0, 75);

        super.setMove(facade);
        super.setMove(swagger);
        super.setMove(poisonPowder);
    }
}
