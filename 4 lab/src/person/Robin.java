package person;

import abstracts.Base;
import enums.Locations;
import enums.Position;
import enums.Repetition;
import interfaces.IRobinActions;

import java.util.Objects;

public class Robin extends Base {
    public Robin(String name,String location ) {
        super(name,location);
    }
    public static class nestedRobinStaticClass implements IRobinActions {
        @Override
        public void go()
        {

            System.out.println(Repetition.EVERY + " morning he went" + Locations.OUTSIDE + "with an umbrella and " +
                    "\n stuck his stick in the place where the water had reached ");

        }
        @Override
        public void stick()
        {
            System.out.println(Repetition.NEXT + " morning the stick was already hidden"+ Position.UNDER +" the water," );
        }
    }


    @Override
    public String toString() {
        String Name = this.getName();
        String Location = this.getLocation();
        return
                Name + " lived at highest of the " + Location +","+
                " water could not reach into " + Name + "'" + Locations.HOUSE+","+ "\n"+
                " it was quite fun to look down and admire all this water," + "\n"+
                " but the rain was so heavy that," + "\n" +
                " sat at " +  Locations.HOME + " almost all the time and thought about different things." ;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        } else if (otherObject != null && this.getClass() == otherObject.getClass()) {
            Base human = (Base)otherObject;
            return Objects.equals(this.Name, human.Name)
                    && this.getLocation().equals(human.Location);

        } else {
            return false;
        }
    }


}

