import java.util.Random;
import java.util.Scanner;

public class GameUtils {

    public static int getPlayerChoice(Scanner scanner) {
        System.out.println("Choose rock: 1, paper: 2, scissor: 3");

        int playerChose = scanner.nextInt();

        while ((playerChose != 1) && (playerChose != 2) && (playerChose != 3)) {
            System.out.println("Invalid input, please choose again.");
            System.out.println("Choose rock: 1, paper: 2, scissor: 3");

            playerChose = scanner.nextInt();
        }

        return playerChose;
    }

    public static int getComputerChoice(Random random) {
        return random.nextInt(3);
    }

    public static void printComputerChoice(int computerChoice) {
        if (computerChoice == 1) {
            System.out.println("Computer chose rock");
        } else if (computerChoice == 2) {
            System.out.println("Computer chose paper");
        } else {
            System.out.println("Computer chose scissors");
        }
    }

    public static String pickWinner(int playerChoice, int computerChoice) {

        if ((playerChoice == 2 && computerChoice == 1) || (playerChoice == 3 && computerChoice == 2)
                || (playerChoice == 1 && computerChoice == 3)) {
            return "You win";

        } else if ((playerChoice == 1 && computerChoice == 2) || (playerChoice == 3 && computerChoice == 1)
                || (playerChoice == 2 && computerChoice == 3)) {

            return ("Computer win");
        } else {
            return ("It's a tie");
        }
    }

}

/*
 * Try to add input validation
 * Do I have to create a new instance of Scanner and Random within the GameUtils
 * methods? Can we instead send the instances of Random and Scanner as
 * parameters?
 * Make a diagram of the program flow.
 * Can I abstract the winning conditions to a constant?
 */