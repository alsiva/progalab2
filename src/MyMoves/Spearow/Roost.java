package MyMoves.Spearow;

import ru.ifmo.se.pokemon.*;

public class Roost extends StatusMove {

    public Roost (double pow, double acc){
        super(Type.FLYING, pow, acc);
    }

    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);
        Effect e = new Effect().stat(Stat.HP, +20);
        p.addEffect(e);
    }
}
