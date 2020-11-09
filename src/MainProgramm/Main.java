package MainProgramm;

import MyPokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {

    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Audino("Scout", 1);
        Pokemon p2 = new Spearow("Soldier", 1);
        Pokemon p3 = new Fearow("Demoman", 1);
        Pokemon p4 = new Bellsprout("Engineer", 1);
        Pokemon p5 = new Weepinbell("Medic", 1);
        Pokemon p6 = new Victreebel("Spy", 1);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);

        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);

        b.go();
    }

    public static boolean chance(double d){
        return d > Math.random();
    }
}
