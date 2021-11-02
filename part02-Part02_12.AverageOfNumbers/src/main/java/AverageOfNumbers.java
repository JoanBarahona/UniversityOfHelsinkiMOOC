
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int result = 0;
        int count = 0;
        double average = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int userInput = Integer.valueOf(scanner.nextLine());
            
            if (userInput == 0) {
                break;
            }//end if
            
            if (userInput != 0) {
                count ++;
                result += userInput;
            }//end if
            
        }//end while
        System.out.println("Average of the numbers: " + 1.0 * result / count);

    }//end of main method
}
