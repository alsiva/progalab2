package MyMoves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class SampleMove extends PhysicalMove {

    public SampleMove (double pow, double acc){
        super(Type.NORMAL, pow, acc);
    }

    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
    }

    protected void applySelfEffects(Pokemon p) { super.applySelfEffects(p);}

    protected String describe(){
        return "Потом доделаю";
    }

}
