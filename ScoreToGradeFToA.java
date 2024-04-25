/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 */
import java.util.*;
public class ScoreToGradeFToA {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        
        int score;
        Scanner iScore = new Scanner(System.in);
        System.out.print("Please enter the number of score: ");//enter the number of score
        score = iScore.nextInt();
        char grade = score>=90?'A':score>=80?'B':score>=70?'C':score>=60?'D':'F';
        
        System.out.println("grade: "+grade);
    }
    
}
