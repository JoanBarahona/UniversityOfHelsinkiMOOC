import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        while(true){
            System.out.println("Title: ");
            String title = scanner.nextLine();
        
        
            if(title.isEmpty()){
            break;
            }
        
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
        
            System.out.println("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());
        
            books.add(new Book(title, pages, year));
        }
    
        System.out.println("");
    
        System.out.println("What information will be printed? ");
        String howMuchInformation = scanner.nextLine();
    
        for(Book book : books){
        
            if(howMuchInformation.equalsIgnoreCase("everything")){
            System.out.println(book);
            }
        
            if(howMuchInformation.equalsIgnoreCase("title")){
            System.out.println(book.getTitle());
            }
        }
    
    }

}
