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
    int[][] score;

    public Game(int players) {
        this.players = players;
        this.availablePlantFood = 0;
        this.round = 0;
        this.score = new int[players][2];
        for (int i = 0; i < players; i++) {
            score[i][0] = i;
            score[i][1] = 0;
        }
    }

    public void nextRound (){
        round++;
    }
    public String showRound () {
        return "Round " + this.round;
    }
    public String showScore () {
        String showScore = "Player \t Score \n";
        for (int i = 0; i < score.length; i++) {
            showScore += "Player " + (i+1) + "\t" + score[i][1] + "\n";
        }
        return showScore;
    }

}
