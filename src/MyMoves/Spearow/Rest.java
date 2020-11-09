package MyMoves.Spearow;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {

    public Rest (double pow, double acc){
        super(Type.PSYCHIC, pow, acc);
    }

    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);
        Effect e = new Effect().turns(2).condition(Status.SLEEP).stat(Stat.HP, 40);//проверь здесь может быть ошибка
        p.addEffect(e);
    }

    protected String describe(){
        return "использует Rest";
    }
}
