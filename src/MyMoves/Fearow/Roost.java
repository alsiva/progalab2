package MyMoves.Fearow;

import ru.ifmo.se.pokemon.*;

public class Roost extends StatusMove {
    public Roost (double pow, double acc){
        super(Type.FLYING, pow, acc);
    }

    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);
        Effect e = new Effect().stat(Stat.HP, +20);//он должен потерять свой тип flying на некоторое время, но непонятно на какое время
        p.addEffect(e);
    }
}
