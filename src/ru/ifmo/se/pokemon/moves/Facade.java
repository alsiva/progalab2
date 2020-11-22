package ru.ifmo.se.pokemon.moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public class Facade extends PhysicalMove {

    public Facade(){
        super(Type.NORMAL, 70, 100);
    }

    boolean check = false;

    protected void applySelfEffects(Pokemon self) {
        if (self.getCondition() == Status.BURN || self.getCondition() == Status.POISON || self.getCondition() == Status.PARALYZE) {
            check = true;
        }
    }

    protected void applyOppEffects(Pokemon enemy) {
        if (check) {
            super.applyOppDamage(enemy, 140);
        }
    }

    protected String describe(){
        return "использует Facade";
    }
}
