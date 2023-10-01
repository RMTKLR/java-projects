package moves;

import ru.ifmo.se.pokemon.*;

public class Shadow_Claw extends PhysicalMove {
    public Shadow_Claw()
    {
        super(Type.GHOST,70,100);
    }

    @Override
    protected double calcCriticalHit(Pokemon pokemon, Pokemon pokemon1) {
      return hits+1;
    }

    @Override
    protected String describe() {
        return "Has an increased chance for a critical hit";
    }
}
