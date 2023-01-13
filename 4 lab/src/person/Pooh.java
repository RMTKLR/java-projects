package person;

import abstracts.Base;
import enums.Position;
import interfaces.IAgree;
import interfaces.IBe;
import interfaces.IDecide;
import interfaces.IPoohAction;

public class Pooh extends Base implements IBe, IDecide, IAgree
{
    public Pooh(String Name,String location){
        super(Name,location);
    }

    @Override
        public void decided () {
        System.out.println(Name + "  could not decide,");
    }
        @Override
        public void being () {
        System.out.println(Name + "  is on the" + Position.TOP + ",");
    }
        @Override
        public void agreed () {System.out.println(Name + " agreed,");}
        public void dangle () {
        System.out.println(Name + "  is dangling his leg,");
     }


}
