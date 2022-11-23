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
