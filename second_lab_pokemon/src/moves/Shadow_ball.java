package moves;

import ru.ifmo.se.pokemon.*;

public class Shadow_ball extends SpecialMove {
    public Shadow_ball(){
        super(Type.GHOST,80,100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect effect = new Effect().chance(0.2).stat(Stat.SPECIAL_DEFENSE,-1);
        pokemon.addEffect(effect);
    }

    @Override
    protected String describe() {
        return "Shadow Ball deals damage and has a 20% chance of lowering the target's Special Defense by one stage.";
    }
}
