
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int sum = 0, count = 0, birthyear = 0, nameLength, temp = 0;
        
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }//end if
            
            String[] parts = input.split(",");
            sum += Integer.valueOf(parts[1]);
            count++;
            nameLength = parts[0].length();
            
            if(temp < nameLength){
                temp = nameLength;
                name = parts[0];
            }//end if
        }//end of while
        
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + 1.0 * sum/count);
    }//end of main
}
