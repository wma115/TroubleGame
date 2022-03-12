/*
 * Defines the board and spaces
 * 
 */
package troublegame;

public class Board {
    
    //Initializing variables to represent aspects of the game board
    final protected int boardLength;
    final protected int startRed;
    final protected int startGreen;
    final protected int startYellow;
    final protected int startBlue;
    final protected int endRed;
    final protected int endGreen;
    final protected int endYellow;
    final protected int endBlue;
    final protected int HomeSpace;
    private int StartReturn;
    private int EndReturn;
    
    public Board(){
        //Board spaces get a defined number to identify them
        //Finish spaces will be based on negative numbers " -1, -2, -3, and -4"s
        //Home spaces will be based on the number 100
        boardLength = 28;
        startRed = 0;
        startGreen = 7;
        startYellow = 14;
        startBlue = 21;
        endRed = 27;
        endGreen = 6;
        endYellow = 13;
        endBlue = 20;
        HomeSpace = 100;
    }
   
    public int startReturn(String color){
        switch (color){
            case "RED":
                this.StartReturn = startRed;
            case "GREEN":
                this.StartReturn = startGreen;
            case "YELLOW":
                this.StartReturn = startYellow;
            case "BLUE":
                this.StartReturn = startBlue;
        }
        return StartReturn;
    }
    
    public int endReturn(String color){
        switch (color){
            case "RED":
                this.EndReturn = endRed;
            case "GREEN":
                this.EndReturn = endGreen;
            case "YELLOW":
                this.EndReturn = endYellow;
            case "BLUE":
                this.EndReturn = endBlue;
        }
        return EndReturn;
    }
    
}
