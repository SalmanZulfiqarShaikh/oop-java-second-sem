//a) Write Java program to Create a class to hold information that is stored in a TAB
//delimited text file names as “countryInfo.txt, as shown in the following sample
//image. A string will be passed as constructor parameter and the class should
//parse and store the columns shown in the image. Rest of the information may
//be ignored. The first row contains heading of each column while subsequent
//lines contain information about a countries that is not required and may be
//ignored. only one country’s information is in one row.
 //b) Write a Java program that reads this file and store information of one row in an
//object and adds this to an ArrayList named as” ciList”.
 //c) In the java program of part 
 //(b), add a function named “ColSum” that accepts
//one integer as index of the column whose column sum is to be returned. 
//d) Use this function to print
//i) Sum of Surface areas of all the countries,
// ii) Sum of their populations
//iii) Average of Life Expectancy values


import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

class countryInfo {
    String name;
    double surface;
    double population;
    double lifeExp;
}

public class index {
    public static void main(String[] args) {
        String filePath = "countryInfo.txt";
        File myFile = new File(filePath);

        

        try {
            ArrayList<ArrayList<String>> ciList = new ArrayList<>();
            Scanner fileReader = new Scanner(myFile);
            fileReader.nextLine();
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] values = line.split("\t");
                ArrayList<String> row = new ArrayList<>();
                for (String val : values) {
                    row.add(val);
                }
                ciList.add(row);
            }
            fileReader.close();
            

            double surfaceSum = ColSum(ciList, 4);
            double populationSum = ColSum(ciList, 6);
            double lifeExpSum = ColSum(ciList, 7);
            double lifeExpAvg = lifeExpSum / ciList.size();

            System.out.println("the total surface Sum is :" + surfaceSum);
            System.out.println("the total surface Sum is :" + populationSum);
            System.out.println("the total surface Sum is :" + lifeExpAvg);


        } catch (FileNotFoundException fnfe) {
            System.out.println("file not found: " + fnfe.getMessage());
        }

        public static double ColSum () {

        }
    }
}
