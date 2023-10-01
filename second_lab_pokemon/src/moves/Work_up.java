package moves;

import ru.ifmo.se.pokemon.*;

public class Work_up extends StatusMove {
    public Work_up(){
        super(Type.NORMAL,0,0);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect effect = new Effect().stat(Stat.SPECIAL_ATTACK,1);
        pokemon.addEffect(effect);
    }

    @Override
    protected String describe() {
        return "Work Up raises the user's Attack and Special Attack by one stage each";
    }
}
