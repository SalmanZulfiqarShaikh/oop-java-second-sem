import java.io.File;
import java.io.FileNotFoundException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ubit {
    public static void main(String[] args) {
        
        String filePath = "sales.txt";
        File myFile = new File(filePath);
        
        String[] days = {"MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY","SUNDAY"};
        int[] totalSalesOnDay = new int[7];
        
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        
        try (Scanner fileScanner = new Scanner(myFile)) {
            
            if (fileScanner.hasNextLine()) {
                fileScanner.nextLine();
            }

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split("\t");

                
                String dateStr = parts[0];
                int unit = Integer.parseInt(parts[5]);
                int qty = Integer.parseInt(parts[4]);
                int total = unit*qty;
                int sales =+ total;

                
                LocalDate date = LocalDate.parse(dateStr, myFormatObj);

               
                DayOfWeek day = date.getDayOfWeek();
                int dayIndex = day.getValue() - 1; 

                
                totalSalesOnDay[dayIndex] += sales;

                
                
            }

            System.out.println("\n  Total Sales by Day: ");
            for (int i = 0; i < days.length; i++) {
                System.out.println(days[i] + ": " + totalSalesOnDay[i]);
            }

        } catch (FileNotFoundException fnfe) {
            System.out.println("File not found: " + fnfe.getMessage());
        } catch (Exception e) {
            System.out.println("Error processing file: " + e.getMessage());
        }
    }
}
