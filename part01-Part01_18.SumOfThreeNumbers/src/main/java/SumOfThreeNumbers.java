
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int firstValue = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondValue = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int thirdValue = Integer.valueOf(scanner.nextLine());
        
        int result = firstValue + secondValue + thirdValue;
        System.out.println("The sum of the numbers is " + result);

    }
}
