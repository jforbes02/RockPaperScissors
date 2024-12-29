import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors {


    public static void main(String[] args) {
        //rounds
        Scanner bestOf = new Scanner(System.in);
        int numRounds = bestOf.nextInt();
        System.out.println("You wanna play? Best of what? (enter number)");

        //wins
        int pWins = 0;
        int cWins = 0;

        while (true) {
            try {
                //computer moves
                String[] rps = {"r", "p", "s"};
                String randMove = rps[new Random().nextInt(rps.length)];
                //player move input
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter your move! [r, p, s]");
                String playerMove = scanner.nextLine().trim();

                if (!playerMove.equals("r") && !playerMove.equals("p") && !playerMove.equals("s")) {
                    System.out.println("Invalid move. PLease enter 'r'(rock) 'p'(paper) or 's'(scissors");
                }else if (playerMove.equals("r") && randMove.equals("s")) {
                    System.out.println("rock beats scissors!");
                    pWins++;
                }else if (playerMove.equals("r") && randMove.equals("p")) {
                    System.out.println("rock loses to paper!");
                    cWins++;
                }else if (playerMove.equals("p") && randMove.equals("r")){
                    System.out.println("paper beats rock!");
                    pWins++;
                }else if (playerMove.equals("p") && randMove.equals("s")){
                    System.out.println("paper loses to scissors!");
                    cWins++;
                }else if (playerMove.equals("s") && randMove.equals("p")){
                    System.out.println("scissors beats paper!");
                    pWins++;
                }else if (playerMove.equals("s") && randMove.equals("r")){
                    System.out.println("scissors loses to rock!");
                    cWins++;
                }else if((playerMove.equals("s") && randMove.equals("s")) || (playerMove.equals("p") && randMove.equals("p")) || (playerMove.equals("r") && randMove.equals("r"))){
                    System.out.println("Tie!");
                }

                if(pWins > numRounds/2){
                    System.out.println("Player won!");
                    return;
                }
                if(cWins > numRounds/2){
                    System.out.println(("Player lost!"));
                    return;
                }
            } catch (Exception e) {
                System.out.println("Error!" + e.getMessage());
            }
        }
    }
}
