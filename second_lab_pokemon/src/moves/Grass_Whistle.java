package moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Grass_Whistle extends StatusMove {
    public Grass_Whistle(){
        super(Type.GRASS,0.0,55.0);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect.sleep(pokemon);
    }

    @Override
    protected String describe() {
        return "Grass Whistle puts the target to sleep, if it hits." ;
    }
}
