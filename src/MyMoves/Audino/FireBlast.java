package MyMoves.Audino;

import MainProgramm.Main;
import ru.ifmo.se.pokemon.*;

public class FireBlast extends SpecialMove {

    public FireBlast (double pow, double acc){
        super(Type.FIRE, pow, acc);
    }

    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        if (Main.chance(0.1)) {
            Effect.burn(p);
        }
    }

    protected String describe(){
        return "использует FireBlast";
    }
}
