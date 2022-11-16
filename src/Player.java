/**
 * Evolution : Player
 *
 * @author viaen
 * @version 15/11/2022
 */
public class Player {
    String name;
    String[][] animals;
    int score;

    public Player(String name) {
        this.name = name;
        this.animals = new String [1][3];
        this.score = 0;
    }

    public void newAnimal(){
        String[][] animalSwitch = this.animals;
        this.animals = new String [animalSwitch.length+1][3];
        for (int i = 0; i < animalSwitch.length; i++){
            for (int j = 0; j < animalSwitch[i].length; j++){
                this.animals[i][j] = animalSwitch[i][j];
            }
        }

    }


}
