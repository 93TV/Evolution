import javax.swing.*;

/**
 * Evolution : Game
 *
 * @author viaen
 * @version 15/11/2022
 */
public class Game {
    int playerAmount;
    int availablePlantFood;
    int round;
    int[] score;
    Animal[][] animals;
    public Game(int playerAmount) {
        this.playerAmount = playerAmount;
        this.availablePlantFood = 0;
        this.round = 0;
        this.score = new int[playerAmount];
        for (int i = 0; i < playerAmount; i++) {
            score[i] = 0;
        }
        animals = new Animal[playerAmount][3];
        Animal A1P1 = new Animal ("A1P1");
        A1P1.CreateAnimal();
        Animal A2P1 = new Animal ("A2P1");
        Animal A3P1 = new Animal ("A3P1");
        Animal A1P2 = new Animal ("A1P2");
        A2P1.CreateAnimal();
        Animal A2P2 = new Animal ("A2P2");
        Animal A3P2 = new Animal ("A3P2");
        animals[0][0] = A1P1;
        animals[0][1] = A1P1;
        animals[0][2] = A1P1;
        animals[1][0] = A1P1;
        animals[1][1] = A1P1;
        animals[1][2] = A1P1;
    }

    public void nextRound (){
        int turnPlayer = 0;
        round++;
        System.out.println(showRound());
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
