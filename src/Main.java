import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String[] rps = {"r", "p", "s"};
            String computerMove = rps[new Random().nextInt(rps.length)];
            System.out.println("Computer chose: " + computerMove);
            String userMove;

            //input validation
            while (true) {
                System.out.println("Make your choice: (R for Rock, P for Paper or S for Scissors)");

                //getting user input and turning it to lowercase for uniformity
                userMove = scanner.nextLine().toLowerCase();
                System.out.println("You picked: " + userMove);
                if (userMove.equals("r") || userMove.equals("p") || userMove.equals("s")) {
                    break;
                }
                System.out.println("Invalid input! Please try again.");}

            //game logic
            if (userMove.equals(computerMove)) {
                System.out.println("Game is a tie!");
            } else if (((userMove.equals("r") && computerMove.equals("s")) ||
                    ((userMove.equals("p")) && computerMove.equals("r")) ||
                    ((userMove.equals("s")) && computerMove.equals("p")))){
                System.out.println("You win!");
            } else{
                System.out.println("You lose.");
            }
            System.out.println("Do you want to play again?! (y/n)");
            String playAgain = scanner.nextLine();
            if (!playAgain.equalsIgnoreCase("y")) {
                break;
            }
        }
        scanner.close();
    }
}
