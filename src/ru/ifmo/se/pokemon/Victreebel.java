package ru.ifmo.se.pokemon;

public class Victreebel extends Pokemon {
    public Victreebel(String name, int level) {
        super(name, level);
        super.setType(Type.GRASS, Type.POISON);
        super.setStats(80,105,65,100,70,70);

        Facade facade = new Facade();
        Swagger swagger = new Swagger();
        PoisonPowder poisonPowder = new PoisonPowder();
        SludgeBomb sludgeBomb = new SludgeBomb();

        super.setMove(facade);
        super.setMove(swagger);
        super.setMove(poisonPowder);
        super.setMove(sludgeBomb);
    }
}
