import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner bestOf = new Scanner(System.in);
        String[] rps = {"r", "p", "s"};
        String randMove = rps[new Random().nextInt(rps.length)];
        int numRounds = bestOf.nextInt();
        int pWins = 0;
        int cWins = 0;
        while (true) {
            if()
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter your move! [r, p, s]");
                String playerMove = scanner.nextLine().trim();
                if (!playerMove.equals("r") && !playerMove.equals("p") && !playerMove.equals("s")) {
                    System.out.println("Invalid move. PLease enter 'r'(rock) 'p'(paper) or 's'(scissors");
                } else if (playerMove.equals("r")) {
                    System.out.println("rock");
                }else if (playerMove.equals("p")){
                    System.out.println("paper");
                } else if (playerMove.equals("s")) {
                    System.out.println("scissors");
                }
            } catch (Exception e) {
                System.out.println("Error!" + e.getMessage());
            }
        }
    }
}