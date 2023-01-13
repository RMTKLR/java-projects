package person;

import abstracts.Base;
import enums.Position;
import interfaces.*;

public class Bear extends Base implements Be,DECIDE,AGREE{

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void decided() {System.out.println( Name + " could not decide, ");}
    @Override
    public void being() {System.out.println( Name + " at the,"+ Position.BOTTOM);}
    @Override
    public void agreed() {System.out.println( Name + "agreed at the end,");}

    @Override
    public String toString() {return "Bear{}";}


}
