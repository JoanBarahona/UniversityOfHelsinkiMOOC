
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        //Declaring the variables and assigning user input to them
        int number = Integer.valueOf(reader.nextLine());
        
        // Printing the result of the operation
        System.out.println(number * number);

    }
}
