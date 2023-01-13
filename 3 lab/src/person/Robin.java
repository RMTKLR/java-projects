package person;

import abstracts.Base;
import enums.Locations;

public class Robin extends Base  {
    @Override
    public void setName(String name) {
        super.setName(name);
    }
   /* public void living(){
        System.out.println( Name + " living at highest of the  " + Locations.FOREST+",");
    }

    public void water(){
        System.out.println("water could not reached into" + Name+"'" + Locations.HOUSE+",");
    }
    public void fun(){
        System.out.println("it was quite fun to look down and admire all this water,");
    }
    public void powerOfRain(){
        System.out.println("but the rain was so heavy that,");
    }
    public void sit(){
        System.out.println(Name + " sat at" + Locations.HOME + "almost all the time and thought about different things.");
    }*/

    /*String water = "water could not reached into" + Name+"'" + Locations.HOUSE+",";
    String fun = "it was quite fun to look down and admire all this water,";
    String powreOfRain = "but the rain was so heavy that,";
    String sit = Name + " sat at" + Locations.HOME + "almost all the time and thought about different things.";

    public String toString(){
        return water + "\n" + fun + "\n" + powreOfRain + "\n" + sit;
    }*/

    @Override
    public String toString() {
        String Name = this.getName();
        return
                Name + " lived at highest of the  " + Locations.FOREST+","+
                "water could not reached into " + Name + "'" + Locations.HOUSE+","+ "\n"+
                "it was quite fun to look down and admire all this water," + "\n"+
                "but the rain was so heavy that," + "\n" +
                "sat at " +  Locations.HOME + "almost all the time and thought about different things." ;
    }


}

