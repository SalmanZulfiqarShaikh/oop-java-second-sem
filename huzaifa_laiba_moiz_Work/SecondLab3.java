interface AdvancedArithmetic{
    int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic{

    public int divisor_sum(int n){
        int result = 0;
        for(int i = 1 ; i <= 1000 ; i ++){
            if(n % i == 0){
                result += i;
            }
        }
        return result;
    }
}
    public class SecondLab3{
    public static void main(String args[]){
        MyCalculator cal1 = new MyCalculator();
        System.out.println(cal1.divisor_sum(6));
    }
}
