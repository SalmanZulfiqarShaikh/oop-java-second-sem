public class gcdProgram {

    public static int gcd(int n, int m) {
        if (m == 0) {  // Base case
            return n;
        }
        return gcd(m, n % m); // formula through which it will be done then m will become n and their remainder will be m
    }
// I am assuming that n is always be >>> m
    public static void main(String[] args) {
       System.out.println(gcd(15, 10));
    }
}
