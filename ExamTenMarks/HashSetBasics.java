import java.util.HashSet;
import java.util.Iterator;

public class HashSetBasics {
    public static void main(String[] args) {
           

              HashSet<Integer> numbers = new HashSet<Integer>();

              numbers.add(22);
                numbers.add(10);
                numbers.add(69);
                numbers.add(10);

                System.out.println("HashSet elements: " + numbers);


                if (numbers.contains(67)) {
                    System.out.println("exists");
                } else {
                    System.out.println("does not exist");
                }


                numbers.remove(10);
                System.out.println("After removing 10: " + numbers);

                System.out.println(numbers.size());

                System.out.println(numbers.getClass());

               Iterator it = numbers.iterator();
 System.out.println("Iterating through HashSet elements:");
               while (it.hasNext()) {
                     System.out.println(it.next());
               }

            
            }
}
