import java.util.*;
public class loopPattern {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int number1;

        System.out.print("\nPlease enter the 1st number: ");//enter the 1st number
        number1 = inp.nextInt();
        inp.close();   
        String b = "*";
        for(int a = 0;a<number1;a++){

            System.out.println(b);
            b = b+"*";
        }
    }
    
}
