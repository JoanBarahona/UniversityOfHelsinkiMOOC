
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("First number?");
        int firstInput = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Last number?");
        int lastInput = Integer.valueOf(scanner.nextLine());
        
        int count = 0;
       
        while (firstInput <= lastInput) {
            
            count += firstInput;
            firstInput++;
            
            System.out.println(firstInput);
            
        }
        
        System.out.println("The sum is " + count);

    }
}
