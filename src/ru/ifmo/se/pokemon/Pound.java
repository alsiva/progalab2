package ru.ifmo.se.pokemon;

public class Pound extends PhysicalMove {

    public Pound() {
        super(Type.NORMAL, 40, 100);
    }

    protected void applyOppEffects(Pokemon enemy) {
        super.applyOppEffects(enemy);
    }

    protected String describe(){
        return "использует Pound";
    }
}
