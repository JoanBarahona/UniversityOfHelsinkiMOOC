

public class FromOneToParameter {

    public static void main(String[] args) {
        
        printUntilNumber(2);

    }
    
    public static void printUntilNumber(int userInput) {
        
        int counter = 1;
        
        while(counter <= userInput) {
            System.out.println(counter);
            counter++;
        }
    }

}
