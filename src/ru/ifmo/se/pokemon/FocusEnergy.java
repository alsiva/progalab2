package ru.ifmo.se.pokemon;

import ru.ifmo.se.pokemon.*;

public class FocusEnergy extends StatusMove {

    public FocusEnergy() {
        super(Type.NORMAL, 0, 0);
    }

    protected void applySelfEffects(Pokemon self) {
        super.applySelfEffects(self);
        self.addEffect(new Effect().stat(Stat.ACCURACY, 2));
    }

    protected String describe(){
        return "использует FocusEnergy";
    }
}
