import java.util.*;

public class LargestNumber {

    public static void main(String[] args) {        
        int highestNumber;    

        List<Integer> numbers = new ArrayList<>();

        Scanner inp = new Scanner(System.in);

        System.out.print("\nPlease enter the 1st number: ");//enter the 1st number
        numbers.add(inp.nextInt());   

        System.out.print("\nPlease enter the 2nd number: ");//enter the 2nd number
        numbers.add(inp.nextInt());  

        System.out.print("\nPlease enter the 3rd number: ");//enter the 3rd number
        numbers.add(inp.nextInt());    
        inp.close();
        
        Collections.sort(numbers);
        highestNumber = numbers.get(numbers.size()-1);

        if(numbers.get(0) == numbers.get(1) && numbers.get(2) == numbers.get(1))
        System.out.println("All numbers are equal");   

        else
        System.out.println("The highest number is "+highestNumber);      
        
    }
    
}
