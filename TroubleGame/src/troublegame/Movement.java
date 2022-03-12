/*
 * Controls player movement
 * Also controls getting in and out of home and finish respectively
 * 
 */
package troublegame;
import java.util.Scanner;


public class Movement extends Board{
    
    //Used to make the roll availabe in all methods
    public int Roll;
    private int item;
    public int pegNum = 1;
    //Used to tell current turn and set next turn
    String[] colors = {"RED", "GREEN", "YELLOW", "BLUE"};
    private int i;
    private String turn;
    //Used to tell distance to the finish
    int[] distances = {28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28};
    
    /**
     * 
     * @return 
     */
    public String currTurn(){
        //Displays current turn
        this.turn = colors[i];
        return turn;
    }
    
    public void chgTurn(){
        //Goes to the next turn
        if(i < 3){
            this.i += 1;
        } else{
            this.i = 0;
        }
        this.turn = colors[i];
    }
        
    public void makeMove(){
        //makes a roll using RandomRoll() method from DiceRoll class
        Dice dice = new Dice();
        this.Roll = dice.randomRoll();
        //System.out.println(dice.toString());
    }
    
    public void normMove(){
        Pegs peg = Pegs.valueOf(currTurn());
        //Checks to see if normal move is possible
        if(peg.getPeg1() == 100 && peg.getPeg2() == 100 && peg.getPeg3() == 100 && peg.getPeg4() == 100){
            System.out.println("A normal move cannot be made because all pegs are in home");
            if(Roll == 6){
                System.out.println("An out of home move can be made");
                //homeMove();
            } else{
                System.out.println("No move can be made, " + currTurn() + " turn ends");
            }
        }else{
            //Peg Movement
            switch (pegNum) {
                case 1:
                    //move peg 1
                    int curPos = peg.getPeg1();
                    int newPos = curPos + Roll;
                    if(distTo(pegNum) <= 0){
                        troubleMove(super.endReturn(currTurn()));
                        peg.setPeg1(super.endReturn(currTurn()));
                    }else if(newPos > 27){
                        int finalPos = newPos - super.boardLength;
                        troubleMove(finalPos);
                        peg.setPeg1(finalPos);
                    } else{
                        troubleMove(newPos);
                        peg.setPeg1(newPos);
                    }
                    break;
                case 2:
                    //move peg 2
                    int curPos2 = peg.getPeg2();
                    int newPos2 = curPos2 + Roll;
                    if(distTo(pegNum) <= 0){
                        troubleMove(super.endReturn(currTurn()));
                        peg.setPeg2(super.endReturn(currTurn()));
                    }else if(newPos2 > 27){
                        int finalPos = newPos2 - super.boardLength;
                        troubleMove(finalPos);
                        peg.setPeg2(finalPos);
                    } else{
                        troubleMove(newPos2);
                        peg.setPeg2(newPos2);
                    }
                case 3:
                    //move peg 3
                    int curPos3 = peg.getPeg3();
                    int newPos3 = curPos3 + Roll;
                    if(distTo(pegNum) <= 0){
                        troubleMove(super.endReturn(currTurn()));
                        peg.setPeg3(super.endReturn(currTurn()));
                    }else if(newPos3 > 27){
                        int finalPos = newPos3 - super.boardLength;
                        troubleMove(finalPos);
                        peg.setPeg3(finalPos);
                    } else{
                        troubleMove(newPos3);
                        peg.setPeg3(newPos3);
                    }
                    break;
                case 4:
                    //move peg 4
                    int curPos4 = peg.getPeg4();
                    int newPos4 = curPos4 + Roll;
                    if(distTo(pegNum) <= 0){
                        troubleMove(super.endReturn(currTurn()));
                        peg.setPeg4(super.endReturn(currTurn()));
                    }else if(newPos4 > 27){
                        int finalPos = newPos4 - super.boardLength;
                        troubleMove(finalPos);
                        peg.setPeg4(finalPos);
                    } else{
                        troubleMove(newPos4);
                        peg.setPeg4(newPos4);
                    }
                    break;
            }
        }
    }
    
    public void homeMove(){
        Scanner input = new Scanner(System.in);
        Pegs peg = Pegs.valueOf(currTurn());
        //Checks to see if out of home move is possible
        if(Roll != 6){
            /*
            System.out.println("The Roll was not a six, please choose one of the other options:");
            */
        } else{
            //Makes the move out of Home to the start space
            switch (pegNum) {
                case 1:
                    troubleMove(super.startReturn(currTurn()));
                    peg.setPeg1(super.startReturn(currTurn()));
                    break;
                case 2:
                    troubleMove(super.startReturn(currTurn()));
                    peg.setPeg2(super.startReturn(currTurn()));
                    break;
                case 3:
                    troubleMove(super.startReturn(currTurn()));
                    peg.setPeg3(super.startReturn(currTurn()));
                    break;
                case 4:
                    troubleMove(super.startReturn(currTurn()));
                    peg.setPeg4(super.startReturn(currTurn()));
                    break;
            }
            //Rolls again to make another move based on the rules
            //makeMove();
        }
    }
    
    public void finishMove(){
        Pegs peg = Pegs.valueOf(currTurn());
        Scanner input = new Scanner(System.in);
        //Checks to see if finish move is possible
        if(Roll == 5 || Roll == 6){
            /*
            System.out.println("The Roll was over a 4, please choose one of the other options:");
            */
        } else{
            //Makes the move into finish - Assumes that the piece you are moving is on the end space
            switch (currTurn()) {
                case "RED":
                    switch (pegNum){
                        case 1:
                            peg.setPeg1(-1);
                            break;
                        case 2:
                            peg.setPeg2(-2);
                            break;
                        case 3:
                            peg.setPeg3(-3);
                            break;
                        case 4:
                            peg.setPeg4(-4);
                            break;
                    }
                case "GREEN":
                    switch (pegNum){
                        case 1:
                            peg.setPeg1(-5);
                            break;
                        case 2:
                            peg.setPeg2(-6);
                            break;
                        case 3:
                            peg.setPeg3(-7);
                            break;
                        case 4:
                            peg.setPeg4(-8);
                            break;
                    }
                case "YELLOW":
                    switch (pegNum){
                        case 1:
                            peg.setPeg1(-9);
                            break;
                        case 2:
                            peg.setPeg2(-10);
                            break;
                        case 3:
                            peg.setPeg3(-11);
                            break;
                        case 4:
                            peg.setPeg4(-12);
                            break;
                    }
                case "BLUE":
                    switch (pegNum){
                        case 1:
                            peg.setPeg1(-13);
                            break;
                        case 2:
                            peg.setPeg2(-14);
                            break;
                        case 3:
                            peg.setPeg3(-15);
                            break;
                        case 4:
                            peg.setPeg4(-16);
                            break;
                    }
            }
        }
    }
    
    /**
     * 
     * @param space 
     */
    public void troubleMove(int space) {
        //Checks all pegs to see if they are on the space a peg is moving to, is so that peg is sent back to home
        for(int j=0; j < colors.length; j++){
            Pegs peg = Pegs.valueOf(colors[j]);
            if(peg.getPeg1() == space){
                peg.setPeg1(super.HomeSpace);
                System.out.println(colors[j] + " PEG 1 was sent back to home");
            } else if(peg.getPeg2() == space){
                peg.setPeg2(super.HomeSpace);
                System.out.println(colors[j] + " PEG 2 was sent back to home");
            } else if(peg.getPeg3() == space){
                peg.setPeg3(super.HomeSpace);
                System.out.println(colors[j] + " PEG 3 was sent back to home");
            } else if(peg.getPeg4() == space){
                peg.setPeg4(super.HomeSpace);
                System.out.println(colors[j] + " PEG 4 was sent back to home");
            }
        } 
    }
    //tracks distance to final for pegs
    /**
     * 
     * @param peg
     * @return 
     */
    public int distTo(int peg){
        switch (currTurn()) {
            case "RED":
                switch (peg) {
                    case 1:
                        distances[0] = distances[0] - Roll;
                        this.item = distances[0];
                        break;
                    case 2:
                        distances[1] = distances[1] - Roll;
                        this.item = distances[1];
                        break;
                    case 3:
                        distances[2] = distances[2] - Roll;
                        this.item = distances[2];
                        break;
                    default:
                        distances[3] = distances[3] - Roll;
                        this.item = distances[3];
                        break;
                }
                break;
            case "GREEN":
                switch (peg) {
                    case 1:
                        distances[4] = distances[4] - Roll;
                        this.item = distances[4];
                        break;
                    case 2:
                        distances[5] = distances[5] - Roll;
                        this.item = distances[5];
                        break;
                    case 3:
                        distances[6] = distances[6] - Roll;
                        this.item = distances[6];
                        break;
                    default:
                        distances[7] = distances[7] - Roll;
                        this.item = distances[7];
                        break;
                }
                break;
            case "YELLOW":
                switch (peg) {
                    case 1:
                        distances[8] = distances[8] - Roll;
                        this.item = distances[8];
                        break;
                    case 2:
                        distances[9] = distances[9] - Roll;
                        this.item = distances[9];
                        break;
                    case 3:
                        distances[10] = distances[10] - Roll;
                        this.item = distances[10];
                        break;
                    default:
                        distances[11] = distances[11] - Roll;
                        this.item = distances[11];
                        break;
                }
                break;
            case "BLUE":
                switch (peg) {
                    case 1:
                        distances[12] = distances[12] - Roll;
                        this.item = distances[12];
                        break;
                    case 2:
                        distances[13] = distances[13] - Roll;
                        this.item = distances[13];
                        break;
                    case 3:
                        distances[14] = distances[14] - Roll;
                        this.item = distances[14];
                        break;
                    default:
                        distances[15] = distances[15] - Roll;
                        this.item = distances[15];
                        break;
                }
                break;
        }
        return item;
    }
    
}
