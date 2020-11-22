package ru.ifmo.se.pokemon;

public class Spearow extends Pokemon {
    public Spearow(String name, int level){
        super(name, level);
        super.setType(Type.NORMAL, Type.FLYING);
        super.setStats(40, 60, 30, 31, 31, 70);
        FocusEnergy focusEnergy = new FocusEnergy();
        Rest rest = new Rest();
        Roost roost = new Roost();
        super.setMove(focusEnergy);
        super.setMove(rest);
        super.setMove(roost);
    }
}
