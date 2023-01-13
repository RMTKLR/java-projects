import person.Bear;
import person.Pooh;
import person.Robin;

public class Main {
    public static void main(String[] args) {
        Bear bear = new Bear();
        Pooh pooh = new Pooh();
        Robin robin = new Robin();
        bear.setName("Bear");
        pooh.setName("Pooh");
        robin.setName("Robin");
        bear.decided();
        pooh.decided();
        bear.agreed();
        pooh.agreed();
        pooh.dangle();
        bear.being();
        pooh.being();
        /*robin.living();
        robin.water();
        robin.fun();
        robin.powerOfRain();
        robin.sit();
        */
        System.out.println(robin);
    }
}