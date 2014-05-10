package queenproject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author Andre
 */
public class queenPuzzle {
   private int board[][] = new int[15][15];
   
   public queenPuzzle(){
       for(int i = 0; i < 15; i++){
           for(int j = 0; j < 15; j++){
               board[i][j] = 0;
           }
       }
       
       List<Integer> queens = new ArrayList<Integer>();
       
       for(int i = 0; i < 15; i++){
           queens.add(i);
       }
       
       Collections.shuffle(queens);
       
       for(int i = 0; i < 15; i++){
           int n = queens.remove(0);
           board[n][i] = 1;
       }
   }
   
   public void print(){
       for(int i = 0; i < 15; i++){
           for(int j = 0; j < 15; j++){
               System.out.print(board[i][j] + " ");
           }
           System.out.println();
       }
   }
   public int attackingQs(){
       int nQueens = 0; 
       
       for(int i = 0; i < 15; i++){
           for(int j = 0; j < 15; j++){
               if(board[j][i] == 1){
                   if(findAdjacent(i, j) > 0) nQueens = nQueens + findAdjacent(i, j);
               }
               System.out.println(board[j][i] + "asdasd");
           }
       }
       return nQueens;
   }
   
   public boolean isSolved(){
       for(int i = 0; i < 15; i++){
           for(int j = 0; j < 15; j++){
               if(board[i][j] == 1){
                   if(findAdjacent(i, j) > 0) return false;
               }
           }
       }
       return true;
   }
   
   public void hillClimb(){
       
   }
   public int findAdjacent(int x, int y){
       int nQueens = 0;
       int xTest1 = x;
       int xTest2 = x;
       //Check for right side and right diagonals both up and down
       for(int i = y; i < 15; i++){
           if(board[x][i] == 1) nQueens++;
           if(xTest1 != 15)
            if(board[xTest1++][i] == 1 ) nQueens++;
           if(xTest2 != -1)
            if(board[xTest2--][i] == 1 ) nQueens++;
       }       
       return nQueens;
   }
}
