package fight_pokemon;

import moves.Energy_ball;
import moves.Grass_Whistle;
import moves.Shadow_ball;
import ru.ifmo.se.pokemon.Type;

public class Roselia extends Budew{
    public Roselia (String name , int level){
        super(name , level);
        this.setStats(50,60,45,100,80,65);
        this.setType(Type.GRASS,Type.POISON);
        this.addMove(new Energy_ball());
        this.addMove(new Shadow_ball());
        this.addMove(new Grass_Whistle());
    }
}
