package abstracts;

import java.util.Objects;
import Exception.InTheMiddleOfNoWhereException;
public abstract class Base {
    public String Name;
    public String Location;
    public void setNameLocation(String name,String location) {
        this.Name = name;
        this.Location = location;
    }
    public Base (String name,String location){
        setNameLocation(name,location);
        if (location == null){
            throw new InTheMiddleOfNoWhereException(name);
        }
    }
    public String getName() {return Name;}
    public String getLocation(){return Location;}


    @Override
    public String toString() {
        return "Base{" +
                "Name='" + Name + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        } else if (otherObject != null && this.getClass() == otherObject.getClass()) {
            Base human = (Base)otherObject;
            return Objects.equals(this.Name, human.Name);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.Name , getLocation());
    }


}
