package finalExamStudy.OOPs;
//Polymorphism is ek hi cheez ka different forms m hona. There are two types of polymorphism in Java: compile-time (or static) polymorphism and runtime (or dynamic) polymorphism. matlab koi ek aadhi cheez change kardena puray cheez ko affect kiye bghair
// Inheritance is k ek class doosri class ki properties aur behaviors ko inherit kr skti hai. matlab ek class k andar doosri class k features use kr skty ho without rewriting the code or uski baad may apni khud ki properties add kr skty ho
// static is jo class k saath hota naa k object k saath. matlab agar ap kisi variable ya method ko static declare krty ho to wo class k saath belong krta hai na k kisi specific object k saath. is ka matlab hai k ap bina class ka object create kiye bhi us static variable ya method ko access kr skty ho
// this reference hota hai jo current object ko refer krta hai. matlab jb ap kisi object k andar kisi method ko call krty ho to wo method usi object k context m kaam krta hai. is ka use apko tab krna chahiye jb apko current object ki properties ya methods ko access krna ho ya phir jab apko constructor chaining krni ho
// super keyword hota hai jo parent class k members ko refer krta hai. matlab jb ap kisi subclass m ho aur apko parent class k properties ya methods ko access krna ho to ap super keyword ka use kr skty ho. is ka use apko tab krna chahiye jb apko parent class k members ko override krna ho ya phir jab apko parent class k constructor ko call krna ho


public class MainCLass {
    public static void main(String[] args) {
          Person p1 = new Person(); // object // Constructor automatically called
          p1.name = "Salman";
          p1.age = 19;

          Person p2 = new Person(); // object
          p2.name = "Ahmed";
          p2.age = 69;

          Developer d1 = new Developer();
          d1.name = "Zara";
            d1.age = 17;
            d1.language = "Python";



            
            p1.info( );
            p2.info( );
            System.out.println(p1.eat() + " and " + p2.walk() + "  ...." + p2.walk(500) );
            System.out.println(d1.eat() + "and " + d1.develop());
        }
}


class Developer extends Person { // Inheritance
    String language;

    String develop() {
        return name + " is developing in " + language;
    }
}

class Person { // blueprint/class
        static int count = 0; // static variable
    String name;
    int age;

    
void info( ) { // method(a fn inside a class)
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
}

String walk( ) {
    return name + " is walking";
}
// Polymorphism Example (Compile time) // parameters must be different
String walk(int steps) {
    return name + " walked " + steps + " steps";
}

String eat( ) {
    return name + " is eating";
 }

Person () {
    count++;
    System.out.println("Constructor called. Total Persons: " + count);
}
}
// Polymorphism Example (Runtime) // pareameters must be same
// class Animal {
//     void sound() {
//         System.out.println("Animal makes a sound");
//     }
// }
// class Dog extends // Inheritance
// Animal {
//     void sound() {
//         System.out.println("Dog barks");
//     }
// }
// class Cat extends Animal {
//     void sound() {
//         System.out.println("Cat meows");
//     }
// }
// class TestPolymorphism {
//     public static void main (String[] args) {
//         Animal a;
//         a = new Dog();
//         a.sound(); // Output: Dog barks

//         a = new Cat();
//         a.sound(); // Output: Cat meows
//     }
// }

// static means smthng that belongs to the class itself rather than to any specific instance of the class. matlab sab object uska use kr skty hn without creating an object of the class.

// this is a reference variable that refers to the current object. It is used within an instance method or constructor to refer to the current object whose method or constructor is being invoked. matlab jb ap kisi object k andar kisi method ko call krty ho to wo method usi object k context m kaam krta hai