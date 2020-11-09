package MyMoves.Audino;
import ru.ifmo.se.pokemon.*;

public class DrainingKiss extends SpecialMove {

    public DrainingKiss(double pow, double acc) { super(Type.FAIRY, pow, acc);}

    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
    }

    protected String describe(){
        return "Использует Draining Kiss";
    }
}
