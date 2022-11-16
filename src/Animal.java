import java.util.Scanner;

/**
 * Evolution : Animal
 *
 * @author viaen
 * @version 15/11/2022
 */
public class Animal {
    String name;
    int bodySize;
    int population;
    String[] traits;
    int hunger;

    public Animal() {
        this.bodySize = 1;
        this.population = 1;
        traits = new String[3];
        name = giveAnimalname();
        hunger = population;
    }

    public String giveAnimalname(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Name your new animal: ");
        return scan.nextLine();
    }

    public void AssignTrait (){

    }

    public void eat (){
        if (isHungry()) {
            hunger -= 1;
        } else System.out.println("Animal " + name + " is wel fed.");
    }

    public boolean isHungry (){
        return hunger != 0;
    }



}
