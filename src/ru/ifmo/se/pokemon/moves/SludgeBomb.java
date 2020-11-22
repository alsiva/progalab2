package ru.ifmo.se.pokemon.moves;

import ru.ifmo.se.pokemon.*;

public class SludgeBomb extends SpecialMove {

    public SludgeBomb(){
        super(Type.POISON, 90, 100);
    }

    protected void applyOppEffects(Pokemon enemy) {
        super.applyOppEffects(enemy);
        enemy.addEffect(new Effect().chance(0.3).condition(Status.POISON));
    }

    protected String describe(){
        return "использует SludgeBomb";
    }

}
