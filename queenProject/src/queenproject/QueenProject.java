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
        queenPuzzle test = new queenPuzzle();
        
        test.print();
        
        test.attackingQs();
        System.out.println("Number of attacking queens: " + test.attackingQs());
    }
    
}
