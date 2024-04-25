import java.util.*;

public class sumOfAllInt {
    public static void main(String[] args) {
        
        List<Integer> numbers = new ArrayList<>();

        Scanner inp = new Scanner(System.in);

        System.out.print("\nPlease enter the 1st number: ");//enter the 1st number
        numbers.add(inp.nextInt());   

        System.out.print("\nPlease enter the 2nd number: ");//enter the 2nd number
        numbers.add(inp.nextInt());  

        System.out.print("\nPlease enter the 3rd number: ");//enter the 3rd number
        numbers.add(inp.nextInt());    
        inp.close();
        int sum = 0;
        for(int number:numbers){
            sum += number;
        }
        System.out.println("The sum of three numbers is: "+sum);

    
    }
}
