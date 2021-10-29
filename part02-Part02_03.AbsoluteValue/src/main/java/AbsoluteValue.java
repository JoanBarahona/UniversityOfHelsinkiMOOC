
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        //Declaring the variables and assigning user input to them
        int number = Integer.valueOf(reader.nextLine());
        
        
        if (number < 0) {
            System.out.println( number * -1);
        } else {
            System.out.println(number);
        }

    }
}
