import java.io.File;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class ubit2 {
    public static void main(String[] args) {
        
        
        
        String filePath = "sales.txt";
        File myFile = new File(filePath);
        
        String [] days = {"MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY","SUNDAY"};
        
          try (Scanner fileScanner = new Scanner(myFile)) {
            fileScanner.nextLine(); 

            while (fileScanner.hasNextLine()) {
                String lines = fileScanner.nextLine();
                String[] line = lines.split("\t");
                String [] date = line[0];
                DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MMM-yyyy");  
                String formattedDate = date.format(myFormatObj);
                  System.out.println("After Formatting: " + formattedDate);
            }
        }  catch (FileNotFoundException fnfe) {
            System.out.println("File not found:" + fnfe.getMessage());
        }



    }
}
