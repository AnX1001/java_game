import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter your name please:");
        String playerInput = scanner.nextLine();

        System.out.println("Welcome to the game: " + playerInput);

        String gameContinue = "yes";
        while (gameContinue.equals("yes")) {

            int playerChoice = GameUtils.getPlayerChoice(scanner);
            int computerChoice = GameUtils.getComputerChoice(random);

            GameUtils.printComputerChoice(computerChoice);
            String theWinner = GameUtils.pickWinner(playerChoice, computerChoice);

            System.out.println(theWinner);

            System.out.println("Do you want to continue, option: yes or no ?");
            gameContinue = scanner.next();

        }
        scanner.close();
    }

}

/*
 * How does the gameContinue = scanner.next() work?
 * why String args[] is needed in main method?
 * Scanner scanner initates a new instance of scanner?
 * is java.util.Scanner a common used library?
 * 
 * Why scanner.close? Does it initiate again?
 * Can I allow multiple rounds of i/o
 * Initiation of Random and Scanner is different why?
 * random.nextInt(3) genereate random number, but why 3 ?
 * 
 * 
 */
