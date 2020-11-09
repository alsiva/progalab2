package MyMoves.Fearow;

import ru.ifmo.se.pokemon.*;

public class FocusEnergy extends StatusMove {
    public FocusEnergy (double pow, double acc){
        super(Type.NORMAL, pow, acc);
    }

    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);
        Effect e = new Effect().stat(Stat.ACCURACY, +2);
        p.addEffect(e);
    }

    protected String describe(){
        return "использует FocusEnergy";
    }
}
