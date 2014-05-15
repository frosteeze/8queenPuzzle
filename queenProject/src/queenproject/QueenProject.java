/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package queenproject;

/**
 *
 * @author Andre
 */
public class QueenProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        queenPuzzle [] test = new queenPuzzle[100];
        System.out.println(test.length);
        for(int i = 0; i < 100; i++){
            test[i] = new queenPuzzle();
        }
        
        int nSolved = 0;
        int steps = 0;
        long realTime = 0;
        for(int i = 0; i < 100; i++){
            long startTime = System.nanoTime();
            steps = steps + test[i].hillClimb();
            long endTime = System.nanoTime();
            realTime = realTime + (endTime - startTime);
            if(test[i].attackingQs() == 0) {
                test[i].print();
                nSolved++;
            }
            System.out.println("The number of attacking queens: " + test[i].attackingQs());
        }
        System.out.println("The number of solved problems is: " + nSolved);
        System.out.println("The average cost is: " + (steps/100));
        double seconds = (double)realTime/1000000000.0;
        System.out.println("The average running time is: " + (seconds/100) + " seconds");
                
    }
    
}
