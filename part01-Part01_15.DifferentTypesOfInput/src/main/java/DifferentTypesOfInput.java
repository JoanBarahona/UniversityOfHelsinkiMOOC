
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String text = scan.nextLine();
   
        System.out.println("Give an integer:");
        int ivalue = Integer.valueOf(scan.nextLine());
        
        System.out.println("Give a double:");
        double dvalue = Double.valueOf(scan.nextLine());
        
        System.out.println("Give a boolean:");
        boolean bvalue = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + text);
        System.out.println("You gave the integer " + ivalue);
        System.out.println("You gave the double " + dvalue);
        System.out.println("You gave the boolean " + bvalue);
        
    }
}
