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
        int playerAmount = 0;
        String input;
        do {
            System.out.println("Let's play Evolution! How many players are joining this game? (2-6)");
            playerAmount =  scan.nextInt();
            scan.nextLine();
        } while (playerAmount < 2 || playerAmount > 6);
        Game newGame = new Game(playerAmount);
        System.out.println("A game has been started with " + newGame.playerAmount + " new players, everyone starts with one animal. \n Rules: \n ");
        System.out.println(newGame.showScore());
        do {
            System.out.println("What's next?");
            System.out.println("PRESS A / Z / E / R");
            System.out.println("A : Create new animal!");
            System.out.println("Z : Increase population of an animal.");
            System.out.println("E : Increase body-size of an animal.");
            System.out.println("R : Assign Traits");
            input = scan.nextLine();
        } while (input.charAt(0) !=  'A' || input.charAt(0) != 'Z' || input.charAt(0) != 'E' || input.charAt(0) != 'R');

        if (input.charAt(0) == 'A') {
            System.out.println("Yay! You've created a new animal!");
            System.out.println("Name your new animal: ");

        }
        if (input.charAt(0) == 'Z') {

        }
        if (input.charAt(0) == 'E') {

        }
        if (input.charAt(0) == 'R') {

        }

    }
}