import java.util.Scanner;

/**
 * ${PROJECT_NAME} : ${NAME}
 *
 * @author ${USER}
 * @version ${DATE}
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int players = 0;
        do {
            System.out.println("Let's play Evolution! How many players are joining this game? (2-6)");
            players =  scan.nextInt();
            scan.nextLine();
        } while (players < 2 || players > 6);
        Game newGame = new Game(players);
        System.out.println("A game has been started with " + newGame.players + " new players, everyone starts with one animal. \n Rules: \n ");
        System.out.println(newGame.showScore());

        for (int i = 0; i <  newGame.players; i++) {
            newGame.showAnimals(i);
        }


    }
}