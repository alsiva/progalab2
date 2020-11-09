package MyMoves.Bellsprout;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public class Facade extends PhysicalMove {

    public Facade (double pow, double acc){
        super(Type.NORMAL, pow, acc);
    }

    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        if (p.getCondition() == Status.BURN || p.getCondition() == Status.POISON || p.getCondition() == Status.PARALYZE) {
            super.applyOppDamage(p, 70);
        }
    }

    protected String describe(){
        return "использует Facade";
    }
}
