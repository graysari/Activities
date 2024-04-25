
public class multiplicationTable {
    public static void main(String[] args) {

        int a = 11;
        for(int b = 1; b < a; b++){

            for(int c = 1; c < a; c++){

                System.out.print(c*b+"\t");
            }
            System.out.println("\n");
        }
    }
}
