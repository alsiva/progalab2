package MyPokemons;

import MyMoves.Audino.DrainingKiss;
import MyMoves.Audino.FireBlast;
import MyMoves.Audino.Pound;
import MyMoves.Audino.ShadowBall;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Audino extends Pokemon {
    public Audino(String name, int level){
        super(name, level);
        super.setType(Type.NORMAL);
        super.setStats(103, 60, 86, 60, 86, 50);
        FireBlast fireBlast = new FireBlast(110, 85);
        DrainingKiss drainingKiss = new DrainingKiss(50, 100);
        ShadowBall shadowBall = new ShadowBall(80, 100);
        Pound pound = new Pound(40, 100);
        super.setMove(fireBlast);
        super.setMove(drainingKiss);
        super.setMove(shadowBall);
        super.setMove(pound);
    }
}
