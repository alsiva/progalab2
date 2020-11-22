package ru.ifmo.se.pokemon;


public class Roost extends StatusMove {

    public Roost(){
        super(Type.FLYING, 0, 0);
    }

    protected void applySelfEffects(Pokemon self) {
        super.applySelfEffects(self);
        double halfMaxHp = self.getStat(Stat.HP);
        Effect effect = new Effect().stat(Stat.HP, (int) (halfMaxHp + self.getHP()));
        self.addEffect(effect);

        self.setType(Type.NONE);
    }
}
