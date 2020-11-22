package ru.ifmo.se.pokemon;

public class FireBlast extends SpecialMove {

    public FireBlast() {
        super(Type.FIRE, 110, 85);
    }

    protected void applyOppEffects(Pokemon enemy) {
        super.applyOppEffects(enemy);
        if (App.chance(0.1)) {
            Effect.burn(enemy);
        }
    }

    protected String describe(){
        return "использует FireBlast";
    }
}
