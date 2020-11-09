package MyMoves.Audino;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Pound extends PhysicalMove {

    public Pound (double pow, double acc){
        super(Type.NORMAL, pow, acc);
    }

    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
    }

    protected String describe(){
        return "использует Pound";
    }
}
