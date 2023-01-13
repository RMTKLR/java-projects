package person;

import abstracts.Base;
import enums.Position;
import interfaces.*;

public class Bear extends Base implements IBe, IDecide, IAgree {

    public Bear(String name,String location) {super(name,location);}

    @Override
    public void decided() {System.out.println( Name + " could not decide in the, " + Location);}
    @Override
    public void being() {System.out.println( Name + " at the,"+ Position.BOTTOM);}
    @Override
    public void agreed() {System.out.println( Name + "agreed at the end,");}


}
