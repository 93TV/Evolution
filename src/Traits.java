/**
 * Evolution : Traits
 *
 * @author viaen
 * @version 15/11/2022
 */
public class Traits {
    String name;
    String description;
    int foodSupply;
    boolean isHerbivoreTrait;
    boolean isCarnivoreTrait;

    public void TraitSelect (int traitNumber) {
        switch (traitNumber){
            case(1) : longNeck();break;
            case(2) : Foraging();break;
            case(3) : hardShell();break;
            case(4) : fertile();break;

        }


    }
    public void longNeck () {


    }
    public void Foraging () {

    }
    public void hardShell () {

    }
    public void fertile () {

    }
}
