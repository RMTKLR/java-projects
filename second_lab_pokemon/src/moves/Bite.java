package moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Bite extends PhysicalMove {
    public Bite() {
        super(Type.DARK, 60,100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect effect = new Effect().chance(0.3);
        Effect.flinch(pokemon);
        pokemon.addEffect(effect);
    }

    @Override
    protected String describe() {
        return "Has a 30% chance to make the target flinch.";
    }
}


