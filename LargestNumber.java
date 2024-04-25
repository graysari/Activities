import java.util.*;
public class LargestNumber {

    public static void main(String[] args) {
        int number1;
        int number2;
        int number3;
        int highestNumber;

        Scanner inp = new Scanner(System.in);

        System.out.print("\nPlease enter the 1st number: ");//enter the 1st number
        number1 = inp.nextInt();

        System.out.print("\nPlease enter the 2nd number: ");//enter the 2nd number
        number2 = inp.nextInt();
        
        System.out.print("\nPlease enter the 3rd number: ");//enter the 3rd number
        number3 = inp.nextInt();
        
        highestNumber = number1>number2?(number1>number3?number1:number3):(number2>number3?number2:number3);
       
        
        if(number1 == number2 && number2 == number3)
        System.out.println("All numbers are equal");    
        else
        System.out.println("The highest number is "+highestNumber);      
        
    }
    
}
