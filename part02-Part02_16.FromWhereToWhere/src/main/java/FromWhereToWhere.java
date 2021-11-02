
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("where to?");
        int endInput = Integer.valueOf(scanner.nextLine());
        
        System.out.println("where from?");
        int startInput = Integer.valueOf(scanner.nextLine());
        
       /* while (startInput <= endInput) {
            System.out.println(startInput);
            startInput++;
        }*/
       
        for (int i = startInput; i <= endInput; i++) {
            if (endInput >= startInput) {
                System.out.println(i);
            }
        }
    }
}
