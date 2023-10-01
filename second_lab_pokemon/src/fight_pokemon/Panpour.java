package fight_pokemon;

import moves.Shadow_Claw;
import moves.Waterfall;
import moves.Work_up;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Panpour extends Pokemon {

    public Panpour(String name, int level) {
        super(name,level);
        this.setType(Type.WATER);
        this.setStats(50,53,48,53,48,64);
        this.addMove(new Shadow_Claw());
        this.addMove(new Waterfall());
        this.addMove(new Work_up());
    }
}
