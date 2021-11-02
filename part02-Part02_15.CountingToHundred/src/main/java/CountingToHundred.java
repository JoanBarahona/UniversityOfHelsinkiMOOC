
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int userInput = Integer.valueOf(scanner.nextLine());
        
        while (userInput <= 100) {
            System.out.println(userInput);
            userInput++;
        }//end of while

    }//end of mine method
}
