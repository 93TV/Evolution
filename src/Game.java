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

        }
    }

    public void nextRound (){
        round++;
    }


}
