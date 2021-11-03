
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 1;
        
        System.out.println("Give a number:");
        int numberInput = scanner.nextInt();
        
        for (int i = 1; i <= numberInput; i++) {
            
            sum *= i;
            System.out.println(sum);
        }
        
        System.out.println("Factorial: " + sum);

    }
}
