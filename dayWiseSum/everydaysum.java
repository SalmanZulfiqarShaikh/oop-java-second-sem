import java.io.File;
import java.io.FileNotFoundException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

// Calculate total sales for each day of the week and display in descending order
public class everydaysum {
     public static void main(String[] args) {
        

        String filePath = "dayWiseSum/sales.txt";

        File myFile = new File(filePath);


        String [] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

        int [] eachDaySum = new int [7];

         DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MMM-yyyy");

        try {
            Scanner FileReader = new Scanner(myFile);
            FileReader.nextLine();
            while (FileReader.hasNextLine()) {
                String line = FileReader.nextLine();
                String[] parts = line.split("\t");
                String dateData = parts[0];
                int unitprice = Integer.parseInt(parts[5]);
                int quantity = Integer.parseInt(parts[4]);
                int total = unitprice * quantity;

                LocalDate date = LocalDate.parse(dateData, dateFormat);
                DayOfWeek dayOfWeek = date.getDayOfWeek();
                int dayIndex = dayOfWeek.getValue() - 1;

                eachDaySum[dayIndex] += total;
            }

            System.out.println("\n Total Sales by Day: ");
            for (int i = 0; i < days.length; i++) {
                  System.out.println(days[i] + ": " + eachDaySum[i]);
            }

            System.out.println("\n In Highest to Lowest Order: ");

            for (int i = 0; i < days.length -1; i++) {
                for (int j = i + 1; j < days.length; j++) {
                    if (eachDaySum[i] < eachDaySum[j]) {
                          String tempDay = days[i];
                            days[i] = days[j];
                            days[j] = tempDay;
                        
                        int tempSum = eachDaySum[i];
                        eachDaySum[i] = eachDaySum[j];
                        eachDaySum[j] = tempSum;
                    }
                }
            }

            for (int i = 0; i < days.length; i++) {
                System.out.println(days[i] + ": " + eachDaySum[i]);
            }

            FileReader.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println("File not found: " + fnfe.getMessage());
        }
    }
}

