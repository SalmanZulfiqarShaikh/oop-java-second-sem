import java.util.HashMap;
import java.util.Set;

public class HashMapBasics {
    public static void main(String[] args) {
        HashMap<String, Integer> Student = new HashMap<>();
        Student.put("Salman",97);
        Student.put("Aamir",98);
        Student.put("Shahrukh",92);
        System.out.println(Student);


        System.out.println(Student.get("Salman"));
        

        Student.forEach((key,value) -> {
            System.out.println("Key: " + key + ", Value: " + value);
        });


         Set<String> keys = Student.keySet();
       for(String key : keys) {
           System.out.println(key+ " got " + Student.get(key) + " marks");
       }

    }
}
