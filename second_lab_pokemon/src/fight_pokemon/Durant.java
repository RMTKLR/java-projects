package fight_pokemon;

import moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
public class Durant extends Pokemon {
    public Durant (String name , int level){
        super(name,level);

        this.setType(Type.BUG,Type.STEEL);
        this.setStats(58,109,112,48,48,109);
        this.addMove(new Bite());
        this.addMove(new Swagger());
        this.addMove(new Aerial_Ace());
        this.addMove(new Confide());

    }
}
