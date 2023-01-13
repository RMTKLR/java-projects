package person;

import abstracts.Base;
import enums.Position;
import interfaces.AGREE;
import interfaces.Be;
import interfaces.DECIDE;

public class Pooh extends Base implements Be , DECIDE, AGREE {


    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void decided() {System.out.println(Name + " could not decide,");  }
    @Override
    public void being() {System.out.println(Name + " is on the" + Position.TOP+","); }
    @Override
    public void agreed() {System.out.println( Name + " agreed,");}
    public void dangle(){System.out.println(Name + " is dangling his leg,"); }



}
