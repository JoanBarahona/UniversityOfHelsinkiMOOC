
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput, sum = 0, count = 0;
        
        while (true) {
            userInput = Integer.valueOf(scanner.nextLine());
            
            if (userInput == 0) {
                break;
            }
            
            if (userInput > 0) {
                count++;
                sum += userInput;
            }
        }//end while
        
        if (count == 0) {
            System.out.println("Cannot calculate the average");
        }
        
        System.out.println(1.0 * sum / count);

    }//end of mine
}
