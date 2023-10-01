package fight_pokemon;

import moves.Energy_ball;
import moves.Grass_Whistle;
import moves.Poison_Sting;
import moves.Shadow_ball;
import ru.ifmo.se.pokemon.Type;

public class Roserade extends Roselia {
    public Roserade(String name , int level){
        super(name,level);
        this.setStats(75,98,63,98,63,101);
        this.setType(Type.GRASS,Type.POISON);
        this.addMove(new Energy_ball());
        this.addMove(new Shadow_ball());
        this.addMove(new Grass_Whistle());
        this.addMove(new Poison_Sting());
    }
}
