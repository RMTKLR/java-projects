package fight_pokemon;

import moves.Focus_blast;
import moves.Shadow_ball;
import moves.Waterfall;
import moves.Work_up;
import ru.ifmo.se.pokemon.Type;

public class Simipour extends Panpour{
    public Simipour(String name, int level){
        super(name, level);
        this.setType(Type.WATER);
        this.setStats(75,98,63,98,63,101);
        this.addMove(new Shadow_ball());
        this.addMove(new Waterfall());
        this.addMove(new Work_up());
        this.addMove(new Focus_blast());
    }
}
