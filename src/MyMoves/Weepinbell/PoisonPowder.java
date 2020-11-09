package MyMoves.Weepinbell;

import ru.ifmo.se.pokemon.*;

public class PoisonPowder extends StatusMove {

    public PoisonPowder (double pow, double acc){
        super(Type.POISON, pow, acc);
    }

    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        Effect.poison(p);
        p.getStat(Stat.HP);
        Effect e = new Effect().stat(Stat.HP, (int)(p.getStat(Stat.HP) / 8.0));
        if (p.getCondition() == Status.POISON) {
            p.addEffect(e);
        }
    }
    protected String describe(){
        return "использует PoisonPowder";
    }
}
