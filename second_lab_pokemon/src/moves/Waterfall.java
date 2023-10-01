package moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Waterfall extends PhysicalMove
{
    public Waterfall(){
        super(Type.WATER,80,100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon)
    {
        Effect effect = new Effect().chance(0.2);
        pokemon.addEffect(effect);
        Effect.flinch(pokemon);
    }

    @Override
    protected String describe()
    {
        return "Waterfall deals damage and has a 20% chance of causing the target to flinch (if the target has not yet moved)";
    }
}

