package ru.ifmo.se.pokemon.pokemons;

import ru.ifmo.se.pokemon.moves.DrillRun;
import ru.ifmo.se.pokemon.moves.FocusEnergy;
import ru.ifmo.se.pokemon.moves.Rest;
import ru.ifmo.se.pokemon.moves.Roost;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

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
