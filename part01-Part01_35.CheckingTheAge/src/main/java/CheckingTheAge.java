
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How old are you? ");
        int number = Integer.valueOf(scanner.nextLine());
        
        if (number >= 0 && number <= 120) {
            System.out.println("ok");
        } else {
            System.out.println("Impossible!");
        }

    }
}
