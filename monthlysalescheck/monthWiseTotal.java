package monthlysalescheck;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class monthWiseTotal {
    public static void main(String[] args) {

        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
                           "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        int[] monthWiseTotal = new int[12];

        String filePath = "sales.txt";
        File myFile = new File(filePath);

        try (Scanner fileScanner = new Scanner(myFile)) {
            fileScanner.nextLine(); 

            while (fileScanner.hasNextLine()) {
                String lines = fileScanner.nextLine();
                String[] line = lines.split("\t");
                if (line.length < 6) continue; 

                String[] date = line[0].split("-");
                String month = date[1];

                int monthIndex = -1;

                for (int i = 0; i < months.length; i++) {
                    if (month.equalsIgnoreCase(months[i])) {
                        monthIndex = i;
                        break;
                    }
                }

                if (monthIndex != -1) {
                    try {
                        int qty = Integer.parseInt(line[4]);
                        int price = Integer.parseInt(line[5]);
                        int total = qty * price;
                        monthWiseTotal[monthIndex] += total;
                    } catch (NumberFormatException nfe) {
                        System.out.println("Invalid number format in line: " + lines);
                    }
                }
            }

            System.out.println("Month-wise Sales Total:");
            for (int i = 0; i < months.length; i++) {
                System.out.println(months[i] + ": " + monthWiseTotal[i]);
            }

        } catch (FileNotFoundException fnfe) {
            System.out.println("An error occurred: " + fnfe.getMessage());
        }
    }
}
