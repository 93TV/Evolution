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
    int[][][] animals;
    public Game(int players) {
        this.players = players;
        this.availablePlantFood = 0;
        this.round = 0;
        this.score = new int[players];
        for (int i = 0; i < players; i++) {
            score[i] = 0;
        }
        this.animals = new int[players][4][11];
        for (int i = 0; i < players; i++) {
            animals[i][0][5] = 1;
        }
    }

    public void showAnimals(int playerX) {
        System.out.println("Player " + playerX);
        for (int j = 0; j < animals[playerX].length; j++) {
            for (int k = 0; k < animals[playerX][j].length; k++) {
                System.out.print(animals[playerX][j][k]);
            }
            System.out.println();
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
            showScore += "Player " + (i+1) + "\t" + score[i] + "\n";
        }
        return showScore;
    }

}
