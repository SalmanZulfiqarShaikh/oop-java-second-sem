package ExamTenMarks;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListBasics {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();


        // add elements to the ArrayList
        numbers.add(10);
        numbers.add(69);
        numbers.add(1947);


        System.out.println(numbers);


        // get elemnts from the ArrayList

        int elementatIndex1 = numbers.get(1);
        System.out.println("\n Element at index 1: " + elementatIndex1);


        // add an elemnt in between

        numbers.add(2,3000);
        numbers.add(0,22);
        System.out.println("\n After adding 3000 at index 2 and 22 at 0: " + numbers);


        // replace/set an element


        numbers.set(3,2222222);
        System.out.println("\n After setting index 3 to 2222222: " + numbers);


        // remove an element
        numbers.remove(0);
        numbers.remove(0);
        numbers.remove(1);
        numbers.remove(1);

        System.out.println("\n My favorite number is remaining in the arraylist i.e:" + numbers);

        // to see size of the ArrayList

        int size = numbers.size();
        System.out.println("\n Size of the ArrayList: " + size);


        numbers.clear();
        System.out.println("\n After clearing the ArrayList: " + numbers);

        numbers.add(1);
        numbers.add(2000);
        numbers.add(-69);
        numbers.add(69);
        numbers.add(2050);
        numbers.add(13);

        Collections.sort(numbers);
        System.out.println("\n After sorting the ArrayList: " + numbers);


        for (int i = 0; i < numbers.size(); i++) {
                System.out.println("\n Element at index " + i + ": " + numbers.get(i));


            }
            System.out.println();
            System.out.println("does list contains 13? " + numbers.contains(13));
            System.out.println("is list empty? " + numbers.isEmpty());
            System.out.println("index of 69 is: " +  numbers.indexOf(69));
    }
}
