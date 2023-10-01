package moves;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    public Swagger(){super(Type.NORMAL, 0, 85);}

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.ATTACK,2);
        Effect.confuse(pokemon);
        //or pokemon.confuse();

    }

    @Override
    protected String describe() {
        return "Raises the target's Attack by two stages and confuses the target";
    }
}
