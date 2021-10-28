
import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        
        System.out.println ("Give a number:");
        int number = scan.nextInt();
        
        if (number != 1984) {
            System.out.println("The number is not equal to 1984");
        }
        
        if (number == 1984) {
            System.out.println("Orwell");
        }
    }
}
