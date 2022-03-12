/*
 * The main program of TroubleGame
 * Will include the game interactions
 * 
 */
package troublegame;
import java.util.Scanner;

public class TroubleGame {
    
    private static String Rule;
    
    /**
     * 
     * @return 
     */
    public static String getRules(){
        //Displays rules of Trouble
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number - 1: Objective  2: Movement  3: Bases  4: Landing on other Players  5: Order");
        String R = input.next();
        if(R.equals("1")){
            Rule = "Your objective is to get all your colored pegs to your color's respective finish first.";
        } else if(R.equals("2")){
            Rule = "Movement is based on a dice roll. Then the peg can move clockwise around the board until it reaches the finish.";
        } else if(R.equals("3")){
            Rule = "To get out of Home base you must roll a 6. If a 6 is rolled and a peg leaves home base, another roll can be performed. To get into the finish an exact roll is needed to get to that space in the finish. A roll over the number of spaces is invalid and the peg cannot move.";
        } else if(R.equals("4")){
            Rule = "If one player lands exactly on another player's peg, the player's peg that was landed on is sent back to home base.";
        } else if(R.equals("5")){
            Rule = "The player using Red will have the first roll of the game. The full order goes: Red, Green, Yellow, Blue.";
        }
        return Rule;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //First the game sets the players
        Scanner input = new Scanner(System.in);
        Player player = new Player();
        PlayerEntry play = new PlayerEntry();
        play.setVisible(true);
    }
}
