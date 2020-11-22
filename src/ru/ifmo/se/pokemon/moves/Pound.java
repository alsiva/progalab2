package ru.ifmo.se.pokemon.moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

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
