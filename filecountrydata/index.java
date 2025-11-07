// Write Java program to;
//a) Read this file and store information of one row in a ArrayList and add this to an
//ArrayList named as” ciList”. b) A function named “ColSum” that accepts one integer as index of the column
//whose column sum is to be returned. c) Use this function to print
//i) Sum of Surface areas of all the countries,
// ii) Sum of their populations
//iii) Average of Life Expectancy values


import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

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

            System.out.println("the total u");


        } catch (FileNotFoundException fnfe) {
            System.out.println("file not found: " + fnfe.getMessage());
        }

        public static double ColSum () {

        }
    }
}

