package finalExamStudy.OOPs;

public class encapsulation{
    public static void main (String[] args) {
        Student1 me = new Student1();
        me.setName("Salman");
        me.setAge(26);
    System.out.println("My name is " + me.getName() + " and I am " + me.getAge() + " years old." + " I live in " + me.city + ", " + me.Country + ". and I am a student of " + me.showSchool() + ".");
    }
}

class Person1 {
      private String name;  // encapsulaition
      private int age;


      public void setName(String name) {
          this.name = name;
      }

        public String getName() {
            return name;
        }

        public void setAge(int age) {
            if (age > 0 && age < 25) {
                this.age = age;
            } else {
                System.out.println("Invalid age");
            }
        }
        public int getAge() {
            return age;
        }

        public String Country = "Pakistan"; // public access modifier
     
        protected String school = "S.M Public Academy"; // protected access modifier


        

        String city = "Karachi"; // default access modifier
}

class Student1 extends Person1 {
     protected String School = "S.M Public Academy";

        public String showSchool() {
            return school;
        }
}
// what is encapsulation? GPT Defenition : ✅ Encapsulation — Simple Definition (Samajh lo hamesha ke liye)

// Encapsulation = Data ko hide + control + protect karna using getters & setters.

// Matlab:

// Variables ko private kar do (direct access band).

// Baaki classes un tak sirf methods ke through pohanch sakti hain → getters & setters.

// Iss se:

// kisi ko directly modify karne ki ijazat nahi hoti

// tum rules laga sakte ho (e.g., age negative na ho)

// data safe, controlled, secure bana rehta hai

// 🔥 One-Line Exam Definition

// "Encapsulation is the process of making variables private and providing public getter/setter methods to control access to them."