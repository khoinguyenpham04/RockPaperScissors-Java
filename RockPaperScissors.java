import java.util.Random;
import java.util.Scanner;

/**
 * The RockPaperScissors class is a simple implementation of the Rock, Paper, Scissors game.
 * It allows the user to play against the computer and keeps track of the score.
 */
public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(true) {
            String[] rps = {"r", "p", "s"};
            String computerMove = rps[new Random().nextInt(rps.length)];

            String playerMove;
            
            // Prompt the user to enter their move
            while(true) {
                System.out.println("Please enter your move (r, p or s)");
                playerMove = scanner.nextLine();
                if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
                    break;
                }
                System.out.println("Player move is not valid! Please enter another move.");
            }

            System.out.println("Computer played: " + computerMove);

            //statements to check the move between the computer and the player
            if (playerMove.equals(computerMove)) {
                System.out.println("The game is a tie.");
            }
            else if (playerMove.equals("r")) {
                if (computerMove.equals("s")) {
                    System.out.println("You Win!");
                }
                if (computerMove.equals("p")) {
                    System.out.println("You Lose!");
                }
            }

            else if (playerMove.equals("p")) {
                if (computerMove.equals("s")) {
                    System.out.println("You Lose!");
                }
                if (computerMove.equals("r")) {
                    System.out.println("You Win!");
                }
            }

            else if (playerMove.equals("s")) {
                if (computerMove.equals("p")) {
                    System.out.println("You Win!");
                }
                if (computerMove.equals("r")) {
                    System.out.println("You Lose!");
                }
            }
            System.out.println("Play again? (y or n)");
            String playAgain = scanner.nextLine();

            if (!playAgain.equals("y")) {
                break;
            }
        }
        scanner.close(); //good prgrammer closes their scanner :)

    }
}
