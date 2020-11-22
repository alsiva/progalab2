package ru.ifmo.se.pokemon.moves;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {

    public Swagger(){
        super(Type.NORMAL, 0, 85);
    }

    protected void applyOppEffects(Pokemon enemy) {
        super.applyOppEffects(enemy);
        Effect e = new Effect().stat(Stat.ATTACK, (int)(enemy.getStat(Stat.ATTACK) + 2));
        enemy.confuse();
        enemy.addEffect(e);
    }

    protected String describe(){
        return "использует Swagger";
    }

}
