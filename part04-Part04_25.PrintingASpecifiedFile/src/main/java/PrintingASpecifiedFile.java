
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Which file shyould have its contents printer?");
        
        String fileName = scanner.nextLine();
        
        try (Scanner scannerFile = new Scanner(Paths.get(fileName))){
        
            while(scannerFile.hasNextLine()){
            
                String row = scannerFile.nextLine();
            
                System.out.println(row);
            }
        
        }catch (Exception e){
            
        System.out.println("Error:" + e.getMessage());
        }

    }
}
