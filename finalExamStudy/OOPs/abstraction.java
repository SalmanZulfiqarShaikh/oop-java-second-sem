package finalExamStudy.OOPs;

// 1. Interface: Contract for walking capability
interface Walkable {
    // Interface method is public and abstract by default
    void walk(); 
}

// 2. Abstract Class: Implements Walkable. 
// Since it is abstract, it can choose to make walk() abstract too.
abstract class Animal implements Walkable {
    int age;
    String name;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    // Abstract method (Mandatory for all concrete Animal subclasses)
    public abstract void sound(); 
    
    // Abstract method from Walkable interface, made abstract here 
    // to force concrete classes (billi, kutta) to implement it.
    @Override 
    public abstract void walk(); 
}

// 3. Concrete Class 1: MUST implement both abstract methods (sound & walk)
class billi extends Animal {
    @Override
    public void sound() {
        System.out.println("Meow Meow");
    }

    @Override
    public void walk() {
        System.out.println("Billi is gracefully walking on four paws.");
    }
}

// 4. Concrete Class 2: MUST implement both abstract methods (sound & walk)
class kutta extends Animal {
    @Override
    public void sound() {
        System.out.println("Bark Bark");
    }

    @Override
    public void walk() {
        System.out.println("Kutta is quickly running on four legs.");
    }
}

// 5. Another class implementing Walkable, for completeness
class Human implements Walkable {
    @Override
    public void walk() {
        System.out.println("Human is walking upright on two legs.");
    }
}

public class abstraction { // Changed class name to avoid conflict
    public static void main(String[] args) {
        billi myCat = new billi(); 
        kutta myDog = new kutta();
        Human myFriend = new Human();
        
        // --- Billi Object ---
        myCat.setName("Kitty");
        myCat.setAge(2);
        System.out.println("--- " + myCat.getName() + " Info ---");
        System.out.println("Age: " + myCat.getAge());
        myCat.sound(); 
        myCat.walk(); // Walkable interface implementation
        
        System.out.println("\n--- Kutta Info ---");
        myDog.sound(); 
        myDog.walk();
        
        System.out.println("\n--- Human Info ---");
        myFriend.walk();
    }
}

// Abstraction in Java, a core principle of Object-Oriented Programming (OOP), is the process of hiding implementation details and showing only the essential features or functionality to the user. It focuses on "what" an object does rather than "how" it does it, simplifying complex systems by presenting a high-level view and reducing complexity. 

// Interface and abstract classes are two primary ways to achieve abstraction in Java:

// interface: An interface is a reference type in Java that defines a contract for classes that implement it. It can contain only abstract methods (methods without a body) and constants (static final variables). Interfaces allow multiple inheritance, meaning a class can implement multiple interfaces. This is useful for defining capabilities that can be shared across different classes, regardless of their position in the class hierarchy. for e.g Walkable interface in the code above. here any class that implements Walkable must provide an implementation for the walk() method. whereas in abstract class Animal, the walk() method is declared as abstract, forcing all concrete subclasses (like billi and kutta) to provide their own implementation of the walk() method. so what is the difference between abstract class and interface here? the difference is that an abstract class can have instance variables (like age and name in Animal) and concrete methods (like setName, getName, setAge, getAge), whereas an interface cannot have instance variables and can only have abstract methods (prior to Java 8). ok so you mean i can change values in abstarct but not in interface? yes, exactly. in abstract class you can have state (instance variables) and behavior (concrete methods), while in interface you can only define behavior (abstract methods).