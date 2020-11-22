package ru.ifmo.se.pokemon;

public class Bellsprout extends Pokemon {
    public Bellsprout(String name, int level){
        super(name, level);
        super.setType(Type.GRASS, Type.POISON);
        super.setStats(50, 75, 35, 70, 30, 40);
        Facade facade = new Facade();
        Swagger swagger = new Swagger();

        super.setMove(facade);
        super.setMove(swagger);
    }
}
