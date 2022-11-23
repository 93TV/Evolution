/**
 * Evolution : Game
 *
 * @author viaen
 * @version 15/11/2022
 */
public class Game {
    int players;
    int availablePlantFood;
    int round;
    int[] score;
    int[][] animals;
    public Game(int players) {
        this.players = players;
        this.availablePlantFood = 0;
        this.round = 0;
        this.score = new int[players];
        for (int i = 0; i < players; i++) {
            score[i] = 0;
        }
        this.animals = new int[players][10];
        for (int i = 0; i < players; i++) {
            animals[i][0] = 1;
        }
    }

    public void newAnimal(int playerX){
        int[][] animalSwitch = this.animals;
        this.animals = new int [animalSwitch.length+1][3];
        for (int i = 0; i < animalSwitch.length; i++){
            for (int j = 0; j < animalSwitch[i].length; j++){
                this.animals[i][j] = animalSwitch[i][j];
            }
        }

    }

    public void nextRound (){
        round++;
    }
    public String showRound () {
        return "Round " + this.round;
    }
    public String showScore () {
        String showScore = "Round " + this.round;
        showScore += "\t Player \t Score \n";
        for (int i = 0; i < score.length; i++) {
            showScore += "Player " + (i+1) + "\t" + score[i][1] + "\n";
        }
        return showScore;
    }

}
