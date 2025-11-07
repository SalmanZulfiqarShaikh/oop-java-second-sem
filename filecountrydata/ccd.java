import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

class CountryInfo {
    String name;
    double surfaceArea;
    double population;
    double lifeExpectancy;

    
    public CountryInfo(String line) {
        String[] parts = line.split("\t");
        try {
            this.name = parts[0]; 
            this.surfaceArea = Double.parseDouble(parts[4]); 
            this.population = Double.parseDouble(parts[6]); 
            this.lifeExpectancy = Double.parseDouble(parts[7]); 
        } catch (Exception e) {
            
            this.surfaceArea = 0.0;
            this.population = 0.0;
            this.lifeExpectancy = 0.0;
        }
    }
}

public class ccd {
    
    public static double ColSum(ArrayList<CountryInfo> ciList, int colIndex) {
        double sum = 0.0;
        for (CountryInfo ci : ciList) {
            switch (colIndex) {
                case 4: 
                    sum += ci.surfaceArea;
                    break;
                case 6: 
                    sum += ci.population;
                    break;
                case 7: 
                    sum += ci.lifeExpectancy;
                    break;
                default:
                    System.out.println("Invalid column index!");
                    return 0.0;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String filePath = "FILECOUNTRYDATA/countryInfo.txt";
        ArrayList<CountryInfo> ciList = new ArrayList<>();

        try {
            File file = new File(filePath);
            Scanner fileReader = new Scanner(file);
            
            if (fileReader.hasNextLine()) fileReader.nextLine();

            
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine().trim();
                if (line.isEmpty()) continue;
                CountryInfo ci = new CountryInfo(line);
                ciList.add(ci);
            }
            fileReader.close();

            
            double surfaceSum = ColSum(ciList, 4);
            double populationSum = ColSum(ciList, 6);
            double lifeExpSum = ColSum(ciList, 7);
            double lifeExpAvg = ciList.size() > 0 ? lifeExpSum / ciList.size() : 0;

           
            System.out.println("Sum of Surface Areas: " + surfaceSum);
            System.out.println("Sum of Populations: " + populationSum);
            System.out.println("Average Life Expectancy: " + lifeExpAvg);

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
