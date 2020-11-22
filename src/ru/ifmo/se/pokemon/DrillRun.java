package ru.ifmo.se.pokemon;

public class DrillRun extends PhysicalMove {

    public DrillRun(){
        super(Type.GROUND, 80, 95);
    }

    protected void applySelfEffects(Pokemon self) {
        super.applySelfEffects(self);
        self.addEffect(new Effect().stat(Stat.ACCURACY, 3));
    }

    protected String describe(){
        return "использует Drill Run";
    }
}
