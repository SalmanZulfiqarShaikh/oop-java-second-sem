import java.util.Scanner;

public class fibonacci {
    public static void printFibonacci(int a, int b, int n) {
        if (n == 0) return; //below n is decreasing so it will be eventually zero and return
        System.out.println(a);
        printFibonacci(b, a + b, n - 1);  //the number b will now be printed
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many till u want seris? ");
        int n = input.nextInt();
        input.close();
        if (n <= 0) {
            System.out.println("Enter a number greater than 0");
        } else {
            printFibonacci(0, 1, n);
        }
    }
}