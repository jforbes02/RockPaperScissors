import java.util.Random;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class RockPaperScissors {
    public static void main(String[] args) {
        //rounds
        System.out.println("You wanna play? Best of what? (enter number)");
        Scanner bestOf = new Scanner(System.in);
        int numRounds = bestOf.nextInt();
        //wins
        int pWins = 0;
        int cWins = 0;

        Map<String, String> rules = new HashMap<>();
        rules.put("r", "s");
        rules.put("p", "r");
        rules.put("s","p");

        while (true) {
            try {
                //computer moves
                String[] rps = {"r", "p", "s"};
                String randMove = rps[new Random().nextInt(rps.length)];
                //player move input
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter your move! [r, p, s]");
                String playerMove = scanner.nextLine().trim();

                if (!rules.containsKey(playerMove)){
                    System.out.println("Invalid move. PLease enter 'r'(rock) 'p'(paper) or 's'(scissors)");
                }else if(playerMove.equals(randMove)){
                    System.out.println("Tie!");
                }else if(rules.get(playerMove).equals(randMove)){
                    System.out.println(playerMove + " beats " + randMove + "!!!");
                    pWins++;
                }else{
                    System.out.println(playerMove + " loses to " + randMove + "!!!");
                    cWins++;
                }

                if(pWins > numRounds/2){
                    System.out.println("You won!");
                    return;
                }
                if(cWins > numRounds/2){
                    System.out.println(("You lost!"));
                    return;
                }
            } catch (Exception e) {
                System.out.println("Error!" + e.getMessage());
            }
        }
    }
}
