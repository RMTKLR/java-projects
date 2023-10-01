package moves;

import ru.ifmo.se.pokemon.*;

public class Energy_ball extends SpecialMove {
    public Energy_ball(){
        super(Type.GRASS,90,100.0);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect effect = new Effect().chance(0.1).stat(Stat.SPECIAL_DEFENSE,-1);
        pokemon.addEffect(effect);
    }

    @Override
    protected String describe() {
        return "Energy Ball deals damage and has a 10% chance of lowering the target's Special Defense by one stage.";
    }
}

