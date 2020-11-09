package MyMoves.Fearow;

import ru.ifmo.se.pokemon.*;

public class DrillRun extends PhysicalMove {

    public DrillRun (double pow, double acc){
        super(Type.GROUND, pow, acc);
    }

    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
    }

    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);
        Effect e = new Effect().stat(Stat.ACCURACY, +4);
        p.addEffect(e);
    }

    protected String describe(){
        return "использует Drill Run";
    }
}
