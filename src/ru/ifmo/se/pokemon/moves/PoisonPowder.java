package ru.ifmo.se.pokemon.moves;

import ru.ifmo.se.pokemon.*;

public class PoisonPowder extends StatusMove {

    public PoisonPowder(){
        super(Type.POISON, 0, 75);
    }

    protected void applyOppEffects(Pokemon enemy) {
        super.applyOppEffects(enemy);
        Effect.poison(enemy);

        if (enemy.getCondition() == Status.POISON) {
            double maxHp = enemy.getStat(Stat.HP);
            Effect effect = new Effect().stat(Stat.HP, (int)(enemy.getHP() - (maxHp / 8)));
            enemy.addEffect(effect);
        }
    }
    protected String describe(){
        return "использует PoisonPowder";
    }
}
