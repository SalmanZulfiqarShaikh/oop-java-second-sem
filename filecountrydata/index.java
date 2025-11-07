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

        ArrayList<String> rowData = new ArrayList<String>();

        try {
            Scanner FileReader = new Scanner(myFile);
            FileReader.nextLine();
            while (FileReader.hasNextLine()) {
                String line = FileReader.nextLine();
                rowData.add(line);
            } 
        } catch (FileNotFoundException fnfe) {
            System.out.println("file not found: " + fnfe.getMessage());
        }
    }
}
