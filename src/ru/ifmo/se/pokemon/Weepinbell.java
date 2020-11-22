package ru.ifmo.se.pokemon;

public class Weepinbell extends Pokemon {
    public Weepinbell(String name, int level) {
        super(name, level);
        super.setType(Type.GRASS, Type.POISON);
        super.setStats(65, 90, 50, 85, 45, 55);

        Facade facade = new Facade();
        Swagger swagger = new Swagger();
        PoisonPowder poisonPowder = new PoisonPowder();

        super.setMove(facade);
        super.setMove(swagger);
        super.setMove(poisonPowder);
    }
}
