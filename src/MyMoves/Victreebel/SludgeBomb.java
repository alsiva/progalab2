package MyMoves.Victreebel;

import ru.ifmo.se.pokemon.*;

public class SludgeBomb extends SpecialMove {

    public SludgeBomb (double pow, double acc){
        super(Type.POISON, pow, acc);
    }

    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        Effect e = new Effect().chance(30).condition(Status.POISON);
        p.addEffect(e);
    }

    protected String describe(){
        return "использует SludgeBomb";
    }

}
