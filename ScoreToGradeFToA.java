
import java.util.*;
public class ScoreToGradeFToA {
    public static void main(String[] args) {
        
        int score;
        Scanner iScore = new Scanner(System.in);
        System.out.print("Please enter the number of score: ");//enter the number of score
        score = iScore.nextInt();
        char grade = score>=90?'A':score>=80?'B':score>=70?'C':score>=60?'D':'F';
        
        System.out.println("grade: "+grade);
    }
    
}
