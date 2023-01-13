import enums.Position;
import enums.Repetition;
import interfaces.IBearActions;
import interfaces.IPoohAction;
import person.Bear;
import person.Pooh;
import person.Robin;
import java.util.Scanner;
import Exception.withoutName;

import javax.naming.Name;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String poohName;
        String bearName;
        String robinName;
        try {
            System.out.print("Enter a name for this person: ");
            poohName = scanner.nextLine();
            if (poohName.isEmpty()) {
                throw new withoutName();
            }
            var pooh = new Pooh(poohName, "Forest");

            // Anonymous Inner Class
            IPoohAction PoohAnonymousClass = new IPoohAction() {
                @Override
                public void grab() {
                    System.out.println( poohName + " grabbed the largest pot of honey ");
                }

                @Override
                public void escape() {
                    System.out.println( " escaped with it to a thick, very thick branch of his tree, sticking high," +
                            " high above the water. Then he climbed");
                }

                @Override
                public void sit() {
                    System.out.println(poohName + " was sitting on a branch");
                }

                @Override
                public void dangle() {
                    System.out.println(poohName + " dangling his legs, and " + Repetition.NEXT + " to him were ten pots of honey ");
                }
            };

            PoohAnonymousClass.grab();
            PoohAnonymousClass.escape();
            PoohAnonymousClass.sit();
            PoohAnonymousClass.dangle();

            pooh.decided();
            pooh.agreed();
            pooh.dangle();
            pooh.being();
        } catch (withoutName theException) {
            System.out.println(theException.getMessage());
            System.out.println("You have to input a name, therefore it is nameless!");
        }


        try {
            System.out.print("Enter a name for this person: ");
            bearName = scanner.nextLine();
            if (bearName.isEmpty()) {
                throw new withoutName();
            }
            var bear = new Bear(bearName, "Forest");
            bear.decided();
            bear.agreed();
            bear.being();

            //Local Inner Class
            class BearInnerLocalClass implements IBearActions {
                @Override
                public void expect() {
                    System.out.println(" Yes, it was not at all what" + " expected to see. " +
                            "\n And the more he looked at " + bearName);
                }

                @Override
                public void see() {
                    System.out.println(" The more he thought about what a brave and smart bear Winnie the Pooh was," +
                            "\n but the more Christopher Robin thought about it");
                }

                @Override
                public void look() {
                    System.out.println(" The more modestly pooh looked at the ground, " +
                            "\n trying to pretend that it was not is he.");
                }
                @Override
                public void winne() {
                    System.out.println(" And then this " +bearName + ", Winnie the Pooh, " +
                            " D.P. (Piglet's Friend), P.K. (Rabbit's Friend) ");
                }
            }
            var i = new BearInnerLocalClass();
            i.expect();
            i.see();
            i.look();
            i.winne();

        } catch (withoutName theException) {
            System.out.println(theException.getMessage());
            System.out.println("You have to input a name, therefore it is nameless!");
        }


        try {
            System.out.print("Enter a name for this person: ");
            robinName = scanner.nextLine();
            if (robinName.isEmpty()) {
                throw new withoutName();

            }
            var robin = new Robin(robinName, "Forest");
            System.out.println(robin);

            //Static Nested Class
            Robin.nestedRobinStaticClass callingRobin = new Robin.nestedRobinStaticClass();
            callingRobin.go();
            callingRobin.stick();
        } catch (withoutName theException) {
            System.out.println(theException.getMessage());
            System.out.println("You have to input a name, therefore it is nameless!");
        }

    }
}

