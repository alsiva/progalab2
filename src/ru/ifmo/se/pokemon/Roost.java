package ru.ifmo.se.pokemon;

import ru.ifmo.se.pokemon.*;

public class Roost extends StatusMove {

    public Roost(){
        super(Type.FLYING, 0, 0);
    }

    protected void applySelfEffects(Pokemon self) {
        super.applySelfEffects(self);
        double halfMaxHp = self.getStat(Stat.HP);
        self.addEffect(new Effect().stat(Stat.HP, (int) (halfMaxHp + self.getHP())));
        //почему-то нет set Type

    }
}
