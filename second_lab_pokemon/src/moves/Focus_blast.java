package moves;


import ru.ifmo.se.pokemon.*;

public class Focus_blast extends SpecialMove {
    public Focus_blast() {
        super(Type.FIGHTING, 120.0, 70.0);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect effect = new Effect().chance(0.1).stat(Stat.SPECIAL_DEFENSE,-1);
        pokemon.addEffect(effect);
    }

    @Override
    protected String describe() {
        return "Focus Blast deals damage and has a 10% chance of lowering the target's Special Defense by one stage.";
    }
}