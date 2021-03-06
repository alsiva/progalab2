package ru.ifmo.se.pokemon;

public class Audino extends Pokemon {
    public Audino(String name, int level){
        super(name, level);
        super.setType(Type.NORMAL);
        super.setStats(103, 60, 86, 60, 86, 50);

        super.setMove(new FireBlast());
        super.setMove(new DrainingKiss());
        super.setMove(new ShadowBall());
        super.setMove(new Pound());
    }
}
