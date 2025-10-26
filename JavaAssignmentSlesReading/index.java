package JavaAssignmentSlesReading;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;



class index {

    public static void main(String[] args) {
        
        String filePath = "JavaAssignmentSlesReading/sales.txt";
        File myFile = new File(filePath);

        int totalSales = 0;
        HashMap <String,Integer> salesByProduct = new HashMap<>();
        HashMap <String,Integer> salesByEmployee = new HashMap<>();
        HashMap <String,Integer> salesByRegion = new HashMap<>();
        HashMap <String,Integer> salesByMonth = new HashMap<>();

        try {
            Scanner filScanner = new Scanner(myFile);
            filScanner.nextLine(); 
            while (filScanner.hasNextLine()) {
                String line = filScanner.nextLine();
                String[] parts = line.split("\t");
                String dateString = parts[0];
                String region = parts[1];
                String employee = parts[2];
                String product = parts[3];
                int qty = Integer.parseInt(parts[4]);
                int salesAmount = Integer.parseInt(parts[5]);
                int total = qty * salesAmount;

                totalSales += total;

                salesByRegion.merge(region, total, Integer::sum);
                salesByEmployee.merge(employee, total, Integer::sum);
                salesByProduct.merge(product, total, Integer::sum);

                String month = dateString.split("-")[1];
                salesByMonth.merge(month, total, Integer::sum);
        } 

            System.out.println("\nTotal Sales: " + totalSales);
            System.out.println("\nRegionWise Saless: " + salesByRegion);
            System.out.println("\nEmployeeWise Sales:" + salesByEmployee);
            System.out.println("\nProductWise Sales:" + salesByProduct);
            System.out.println("\nMonthWise Sales:" + salesByMonth);

            filScanner.close();
    }
    catch (FileNotFoundException fnfe) {
            System.out.println("An error occurred while reading the file: " + fnfe.getMessage());
        }

    }
}