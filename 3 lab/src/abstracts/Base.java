package abstracts;


import java.util.Objects;

public abstract class Base {
    public String Name;

    public void setName(String name) {
        this.Name = name;
    }

    public String getName() {
        return Name;
    }
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
        return Objects.hash(this.Name);
    }
}
