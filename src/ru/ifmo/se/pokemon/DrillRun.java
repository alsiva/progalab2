package ru.ifmo.se.pokemon;

import ru.ifmo.se.pokemon.*;

public class DrillRun extends PhysicalMove {

    public DrillRun(){
        super(Type.GROUND, 80, 95);
    }

    protected void applySelfEffects(Pokemon self) {
        super.applySelfEffects(self);
        Effect e = new Effect().stat(Stat.ACCURACY, +4);
        self.addEffect(e);
    }

    protected String describe(){
        return "использует Drill Run";
    }
}
