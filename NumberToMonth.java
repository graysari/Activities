
import java.util.*;
public class NumberToMonth {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int numberOfMonth;
        
       System.out.print("Please enter the number of month: ");//enter the number of month
       numberOfMonth = inp.nextInt();
       inp.close();
       int numberOfDays;
       if(numberOfMonth>7) 
       numberOfDays =numberOfMonth%2==0?31:30;
       else
       numberOfDays = numberOfMonth==2?28:numberOfMonth%2==0?30:31;
           
       switch(numberOfMonth){
           case 1:   System.out.println("Month: January \nNumber of Days: "+numberOfDays);break;
           case 2:   System.out.println("Month: February \nNumber of Days: "+numberOfDays);break;
           case 3:   System.out.println("Month: March \nNumber of Days: "+numberOfDays);break;
           case 4:   System.out.println("Month: April \nNumber of Days: "+numberOfDays);break;
           case 5:   System.out.println("Month: May \nNumber of Days: "+numberOfDays);break;
           case 6:   System.out.println("Month: June \nNumber of Days: "+numberOfDays);break;
           case 7:   System.out.println("Month: July \nNumber of Days: "+numberOfDays);break;
           case 8:   System.out.println("Month: August \nNumber of Days: "+numberOfDays);break;
           case 9:   System.out.println("Month: September \nNumber of Days: "+numberOfDays);break;
           case 10:   System.out.println("Month: October \nNumber of Days: "+numberOfDays);break;
           case 11:   System.out.println("Month: November \nNumber of Days: "+numberOfDays);break;
           case 12:   System.out.println("Month: December \nNumber of Days: "+numberOfDays);break;
              
           default: System.out.println("invalid number of month");
       
       
       }
    
}
}
