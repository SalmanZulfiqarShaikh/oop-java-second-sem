public class toggle {
    public static void main(String[] args) {
        int n = 9; //1001
        int pos = 0; 

        int bitMask = 1 << pos; //0001

        int newNum = bitMask ^ n;

        System.out.println(Integer.toBinaryString(newNum));


    }
}
