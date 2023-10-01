package fight_pokemon;

import moves.Energy_ball;
import moves.Shadow_ball;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Budew extends Pokemon {
    public Budew(String name, int level) {
        super(name,level);
        this.setType(Type.GRASS,Type.POISON);
        this.setStats(40,30,35,50,70,55);
        this.addMove(new Energy_ball());
        this.addMove(new Shadow_ball());
    }

}
