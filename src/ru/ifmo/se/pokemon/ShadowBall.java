package ru.ifmo.se.pokemon;

import ru.ifmo.se.pokemon.App;
import ru.ifmo.se.pokemon.*;

public class ShadowBall extends SpecialMove {

    public ShadowBall() {
        super(Type.GHOST, 80, 100);
    }

    protected void applyOppEffects(Pokemon enemy) {
        super.applyOppEffects(enemy);
        if (App.chance(0.2)) {
            Effect breakDefence = new Effect().stat(Stat.DEFENSE, (int) (enemy.getStat(Stat.DEFENSE) - 1));
            enemy.addEffect(breakDefence);
        }
    }

    protected String describe(){
        return "использует ShadowBall";
    }
}
