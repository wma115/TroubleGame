/*
 * Creates Players
 * Keeps track of player's names and peg color
 * 
 */
package troublegame;

public class Player {
    //keeps track of pegs positions. Used to fix a problem with position tracking in pegs
    protected String playerRed;
    protected String playerBlue;
    protected String playerGreen;
    protected String playerYellow;
    
    public Player(){
        playerRed = "None";
        playerBlue = "None";
        playerGreen = "None";
        playerYellow = "None";
    }
    
    /**
     * 
     * @param Red
     * @param Blue
     * @param Green
     * @param Yellow 
     */
    public void setPlayers(String Red, String Blue, String Green, String Yellow){
        this.playerRed = Red;
        this.playerBlue = Blue;
        this.playerGreen = Green;
        this.playerYellow = Yellow;
    }
    
    /**
     * 
     * @return 
     */
    @Override
    public String toString(){
        return playerRed + " is using Red, " + playerBlue + " is using Blue, " + playerGreen + " is using Green, and " + playerYellow + " is using Yellow.";
    }
}
