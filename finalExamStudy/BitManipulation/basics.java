package finalExamStudy.BitManipulation;

public class basics {
    public static void main(String[] args) {
      int n1 = 5;
        int n2 = 3;

        // AND
        int andResult = n1 & n2; // 0101 & 0011 = 0001
        System.out.println("AND: " + andResult); // Output: 1

        // Or
        int orResult = n1 | n2; // 0101 & 0011 = 0111;
        System.out.println(orResult);

        // Not
        int notResult = ~n1; // 0101 = 1010
        System.out.println("NOT: " + notResult); // Output: -6 (in two's complement)

        //XOR
        int xorResult = n1 ^ n2; // 0101 ^ 0011 = 0110
        System.out.println("XOR: " + xorResult); // Output: 6

        // left shift
        int leftShiftResult = n1 << 1; // 0101 << 1 = 1010
        System.out.println("Left Shift: " + leftShiftResult); // Output: 10

        // right shift
        int rightShiftResult = n1 >> 1; // 0101 >> 1 = 0010
        System.out.println("Right Shift: " + rightShiftResult); // Output: 2

        //Questions: 
        // Q1. Make a specific bit 0 

        int n = 19; // 10011

        int pos = 1; // 100(1)1

        int bitMask = 1 << pos; // 00001 << 1 = 00010
        int newBitMask = ~bitMask; // 11101
        int newNumber = n & newBitMask; // 10011 & 11101 = 10001
        System.out.println(newNumber); // 17


        // Q2 . Make a specific bit 1

        int num = 69; // 1000101
        int pos2 = 4; // 10(0)0101

        int bitMask2 = 1 << pos2; // 0000001 << 4 = 0010000
        int newBitMask2 = num | bitMask2;
        System.out.println(newBitMask2); // 85
        // Q3. Toggle a specific bit
        int number = 15; // 1111
        int position = 2;

        int bitMask3 = 1 << position; // 0001 << 2 = 0100;
        int toggledNumber = number ^ bitMask3; // 1111 ^ 0100 = 1011 // xor > if same 0 else 1
        System.out.println("Binary: " + Integer.toBinaryString(toggledNumber) + " real num: " + toggledNumber); // 11
    }
}

