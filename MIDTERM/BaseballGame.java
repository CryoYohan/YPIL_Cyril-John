import jva.util.Scanner;

public BaseballGame{

   private String[] teamNames = new String[2];
   protected int[][] scores;
   
   public BaseballGame(){
      scores = new int[2][9];
      for(int i =0; i <=1; i++){
         for(int j = 0; j <9; j++){
            scores[i][j] = 999;
         }
      }
   }
   
   public void setTeamNames(int team, String name){
      teamNames[team] = name;
   }
   
    

}