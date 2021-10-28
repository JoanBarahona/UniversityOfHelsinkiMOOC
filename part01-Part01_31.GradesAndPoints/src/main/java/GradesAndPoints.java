
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give points [0-100]:");
        int numberOne =scan.nextInt();
        
        if (numberOne < 0) {
            System.out.println("Grade: ¡impossible");
        } else if (numberOne <= 49){
            System.out.println("Grade: failed");
        } else if (numberOne <= 59) {
            System.out.println("Grade: 1");
        } else if (numberOne <= 69) {
            System.out.println("Grade: 2");
        } else if (numberOne <= 79) {
            System.out.println("Grade: 3");
        } else if (numberOne <= 89) {
            System.out.println("Grade: 4");
        } else if (numberOne <= 100){
            System.out.println("Grade: 5");
        } else {
            System.out.println("Grade: ¡incredible!");
        }

    }
}
