package MyPokemons;

import MyMoves.Bellsprout.Facade;
import MyMoves.Bellsprout.Swagger;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Bellsprout extends Pokemon {
    public Bellsprout(String name, int level){
        super(name, level);
        super.setType(Type.GRASS, Type.POISON);
        super.setStats(50, 75, 35, 70, 30, 40);
        Facade facade = new Facade(70, 100);
        Swagger swagger = new Swagger(0, 85);

        super.setMove(facade);
        super.setMove(swagger);
    }
}
