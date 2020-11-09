package MyPokemons;

import MyMoves.Fearow.DrillRun;
import MyMoves.Spearow.FocusEnergy;
import MyMoves.Spearow.Rest;
import MyMoves.Spearow.Roost;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Fearow extends Pokemon {
    public Fearow(String name, int level){
        super(name, level);
        super.setType(Type.NORMAL, Type.FLYING);
        super.setStats(65, 90, 65, 61, 61, 100);
        FocusEnergy focusEnergy = new FocusEnergy(0, 0);
        Rest rest = new Rest(0, 0);
        Roost roost = new Roost(0, 0);
        DrillRun drillRun = new DrillRun(80, 95);
        super.setMove(focusEnergy);
        super.setMove(rest);
        super.setMove(roost);
        super.setMove(drillRun);
    }
}
