
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int numberOne = Integer.valueOf(reader.nextLine());
        int numberTwo = Integer.valueOf(reader.nextLine());
        
        double squareRoot = Math.sqrt(numberOne + numberTwo);
        
        System.out.println(squareRoot);

    }
}
