package ru.ifmo.se.pokemon;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {

    public Rest(){
        super(Type.PSYCHIC, 0, 0);
    }

    protected void applySelfEffects(Pokemon self) {
        super.applySelfEffects(self);
        double fullHp = self.getStat(Stat.HP);
        Effect restoreHp = new Effect().turns(2).condition(Status.SLEEP).stat(Stat.HP, (int)fullHp);
        self.addEffect(restoreHp);
    }

    protected String describe(){
        return "использует Rest";
    }
}
