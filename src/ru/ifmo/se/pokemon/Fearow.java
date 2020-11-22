package ru.ifmo.se.pokemon;

public class Fearow extends Pokemon {
    public Fearow(String name, int level){
        super(name, level);
        super.setType(Type.NORMAL, Type.FLYING);
        super.setStats(65, 90, 65, 61, 61, 100);
        FocusEnergy focusEnergy = new FocusEnergy();
        Rest rest = new Rest();
        Roost roost = new Roost();
        DrillRun drillRun = new DrillRun();
        super.setMove(focusEnergy);
        super.setMove(rest);
        super.setMove(roost);
        super.setMove(drillRun);
    }
}
