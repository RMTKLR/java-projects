package moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Poison_Sting extends PhysicalMove {
    public Poison_Sting(){
        super(Type.POISON,15,100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect effect = new Effect().chance(0.3);
        pokemon.addEffect(effect);
        Effect.poison(pokemon);
    }

    @Override
    protected String describe() {
        return "Poison Sting deals damage and has a 30% chance of poisoning the target.";
    }
}
