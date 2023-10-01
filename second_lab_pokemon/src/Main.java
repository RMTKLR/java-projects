import fight_pokemon.*;
import ru.ifmo.se.pokemon.*;
public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Simipour simipour = new Simipour("Germany", 1);
        Durant durant = new Durant("Russia",1);
        Panpour panpour = new Panpour("USA",1);
        Roselia roselia = new Roselia("china",1);
        Roserade roserade = new Roserade("north korea",1);
        Budew budew = new Budew("Ukraine",1);
        b.addAlly(simipour);
        b.addAlly(durant);
        b.addAlly(panpour);
        b.addFoe(roselia);
        b.addFoe(roserade);
        b.addFoe(budew);
        b.go();
    }
}
