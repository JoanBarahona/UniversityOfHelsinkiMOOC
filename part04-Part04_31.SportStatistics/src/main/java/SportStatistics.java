
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File: ");
        String fileName = scan.nextLine();
        
        System.out.println("Team: ");
        String searchTeam = scan.nextLine();
        
        int gameCounter = 0;
        int wins = 0;
        int losses = 0;
        
        try(Scanner fileScanner = new Scanner(Paths.get(fileName))){
            
            while(fileScanner.hasNextLine()){
                String[]splitString = fileScanner.nextLine().split(",");
                
                if(splitString.equals("")){
                    continue;
                }
                
                String homeTeam = splitString[0].trim();
                String awayTeam = splitString[1].trim();
                
                int homePoints = Integer.valueOf(splitString[2].trim());
                int awayPoints = Integer.valueOf(splitString[3].trim());
                
                if(searchTeam.equals(homeTeam.toLowerCase())){
                    
                    gameCounter++;
                    
                    if(homePoints > awayPoints){
                        wins++;
                    }else{
                        losses++;
                    }
                }
                
                if(searchTeam.equals(awayTeam.toLowerCase())){
                    
                    gameCounter++;
                    
                    if(awayPoints > homePoints){
                        wins++;
                    }else{
                        losses++;
                    }
                }
            }
            
            System.out.println("Games: " + gameCounter);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
            
        }catch(Exception e){
            
            System.out.println("Error reading file" + e.getMessage());
        }

    }

}
