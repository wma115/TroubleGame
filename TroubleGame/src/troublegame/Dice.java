/*
 * 
 * Controls a random dice roll
 * 
 */
package troublegame;
import java.util.Random;

public class Dice {
    
    protected int diceRoll;
    
    /**
     * 
     * @return 
     */
    public int randomRoll(){
        //generates random number from 1-6 to represent a dice roll
        Random rand = new Random();
        int roll = rand.nextInt(6) + 1;
        this.diceRoll = roll;
        return diceRoll;
    }
    
    /**
     * 
     * @return 
     */
    public int previousRoll(){
        return diceRoll;
    }
    
    /**
     * 
     * @return 
     */
    @Override
    public String toString(){
        return "You rolled a " + diceRoll + " this turn";
    }
}
