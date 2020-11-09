package MyPokemons;

import MyMoves.Spearow.FocusEnergy;
import MyMoves.Spearow.Rest;
import MyMoves.Spearow.Roost;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Spearow extends Pokemon {
    public Spearow(String name, int level){
        super(name, level);
        super.setType(Type.NORMAL, Type.FLYING);
        super.setStats(40, 60, 30, 31, 31, 70);
        FocusEnergy focusEnergy = new FocusEnergy(0, 0);
        Rest rest = new Rest(0, 0);
        Roost roost = new Roost(0, 0);
        super.setMove(focusEnergy);
        super.setMove(rest);
        super.setMove(roost);
    }
}
