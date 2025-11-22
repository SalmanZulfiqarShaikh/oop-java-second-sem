public class Counter {
    static int count;

    // Constructor
    Counter(){
        count += 1;
    }

    public static void main(String args[]){
        Counter obj1 = new Counter();
        System.out.println("The value of counter is: "+Counter.count);
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();
        System.out.println("The value of counter is: "+Counter.count);
        Counter obj4 = new Counter();
        Counter obj5 = new Counter();

        System.out.println("The value of counter is: "+Counter.count);
    }
}
