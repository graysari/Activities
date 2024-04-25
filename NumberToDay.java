import java.util.*;
public class NumberToDay {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int numberOfDay;
        
        System.out.print("Please enter the number of day: ");//enter the number of day
       numberOfDay = inp.nextInt();
       
      
           
       switch(numberOfDay){
           case 1:   System.out.println("MONDAY");break;
           case 2:   System.out.println("TUESDAY");break;
           case 3:   System.out.println("WEDNESDAY");break;
           case 4:   System.out.println("THURSDAY");break;
           case 5:   System.out.println("FRIDAY");break;
           case 6:   System.out.println("SATURDAY");break;
           case 7:   System.out.println("SUNDAY");break;
           default: System.out.println("INVALID NUMBER");break;
       }
    
    }
    
}
