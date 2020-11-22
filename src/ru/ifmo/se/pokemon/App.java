package ru.ifmo.se.pokemon;

import ru.ifmo.se.pokemon.pokemons.*;

public class App {

    public static void main(String[] args) {
        Battle battle = new Battle();

        Pokemon audino = new Audino("Scout", 1);
        Pokemon spearow = new Spearow("Soldier", 1);
        Pokemon fearow = new Fearow("Demoman", 1);
        Pokemon bellsprout = new Bellsprout("Engineer", 1);
        Pokemon weepinbell = new Weepinbell("Medic", 1);
        Pokemon victreebel = new Victreebel("Spy", 1);

        battle.addAlly(audino);
        battle.addAlly(spearow);
        battle.addAlly(fearow);

        battle.addFoe(bellsprout);
        battle.addFoe(weepinbell);
        battle.addFoe(victreebel);

        battle.go();
    }

    public static boolean chance(double d){
        return d > Math.random();
    }
}
