import java.util.*;
public class oddEvenPosNegZero {

    public static void main(String[] args) {
        int number;
        System.out.print("Please enter a number: ");
        Scanner inp = new Scanner(System.in);
        number = inp.nextInt();
        
        String odd;
        String possitive;
        String zero;

        if (number == 0) {
            zero = "YES";
        }
        else{
            odd = number%2==0?"Even":"Odd";
            possitive = number>0?"Possitive":"Negative";
            zero = "No";

            System.out.println("Odd or Even?: "+odd);
            System.out.println("Possitive or Negative?: "+possitive);
        }        
        
        System.out.println("Zero?: "+zero);
    }
    
}
