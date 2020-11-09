package MyMoves.Audino;

import MainProgramm.Main;
import ru.ifmo.se.pokemon.*;

public class ShadowBall extends SpecialMove {

    public ShadowBall (double pow, double acc){
        super(Type.GHOST, pow, acc);
    }

    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        Effect e = new Effect().stat(Stat.DEFENSE, -1);
        if (Main.chance(0.2)) {
            p.addEffect(e);
        }
    }

    protected String describe(){
        return "использует ShadowBall";
    }
}
