package ru.ifmo.se.pokemon;
import ru.ifmo.se.pokemon.*;

public class DrainingKiss extends SpecialMove {

    public DrainingKiss() { super(Type.FAIRY, 50, 100);}

    protected void applyOppEffects(Pokemon enemy) {
        super.applyOppEffects(enemy);
    }


    protected void applySelfDamage(Pokemon self, double damage) {
        double healHp = damage * 0.75;
        Effect healEffect = new Effect().stat(Stat.HP, (int) (self.getHP() + healHp));
        self.addEffect(healEffect);
    }

    protected String describe(){
        return "Использует Draining Kiss";
    }


}
