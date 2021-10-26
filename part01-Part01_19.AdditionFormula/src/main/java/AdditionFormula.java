
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        System.out.println("Give the first number:");
        int firstValue = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondValue = Integer.valueOf(scanner.nextLine());
        
        //int result = firstValue + secondValue;
        //System.out.println(result);
        System.out.println(firstValue + " + " + secondValue + " = " + (firstValue + secondValue));

    }
}
