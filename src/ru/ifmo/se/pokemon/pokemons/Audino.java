package ru.ifmo.se.pokemon.pokemons;

import ru.ifmo.se.pokemon.moves.DrainingKiss;
import ru.ifmo.se.pokemon.moves.FireBlast;
import ru.ifmo.se.pokemon.moves.Pound;
import ru.ifmo.se.pokemon.moves.ShadowBall;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Audino extends Pokemon {
    public Audino(String name, int level){
        super(name, level);
        super.setType(Type.NORMAL);
        super.setStats(103, 60, 86, 60, 86, 50);

        super.setMove(new FireBlast());
        super.setMove(new DrainingKiss());
        super.setMove(new ShadowBall());
        super.setMove(new Pound());
    }
}
