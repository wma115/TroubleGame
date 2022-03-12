/*
 * Keeps track of the player's pegs and their position on the board
 */
package troublegame;

public enum Pegs{
      //sets all pegs to start at HomeSpace
      RED(100, 100, 100, 100),
      BLUE(100, 100, 100, 100),
      GREEN(100, 100, 100, 100),
      YELLOW(100, 100, 100, 100);
      
      public int Peg1Loc;
      public int Peg2Loc;
      public int Peg3Loc;
      public int Peg4Loc;
      
      private String pegStr;
      
      private Pegs(int OneLoc, int TwoLoc, int ThreeLoc, int FourLoc){
          this.Peg1Loc = OneLoc;
          this.Peg2Loc = TwoLoc;
          this.Peg3Loc = ThreeLoc;
          this.Peg4Loc = FourLoc;
      }
      
      //Used to get a specific peg location under color
      /**
       * 
       * @return 
       */
      public int getPeg1(){
          return this.Peg1Loc;
      }
      /**
       * 
       * @return 
       */
      public int getPeg2(){
          return this.Peg2Loc;
      }
      /*
      
      */
      public int getPeg3(){
          return this.Peg3Loc;
      }
      /**
       * 
       * @return 
       */
      public int getPeg4(){
          return this.Peg4Loc;
      }
      
      //Sets a specific peg location under a color
      /**
       * 
       * @param Loc 
       */
      public void setPeg1(int Loc){
          this.Peg1Loc = Loc;
      }
      /**
       * 
       * @param Loc 
       */
      public void setPeg2(int Loc){
          this.Peg2Loc = Loc;
      }
      /**
       * 
       * @param Loc 
       */
      public void setPeg3(int Loc){
          this.Peg3Loc = Loc;
      }
      /**
       * 
       * @param Loc 
       */
      public void setPeg4(int Loc){
          this.Peg4Loc = Loc;
      }
      
}
