public class maxValue {


    public static int findMax(int[] arr, int index) {
   
        if (index == arr.length - 1) {
            return arr[index];
        }  // if array contain only one element
        
    
        int leftoverArray = findMax(arr, index + 1); // to check other than current value(nums that are ahead of current value)
        

        if (arr[index] > leftoverArray) {
            return arr[index];
        } else {
            return leftoverArray;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {22,69,15,278,4,33,100,547,3,11};  
        
        int max = findMax(numbers, 0); //coz we staert from 22 and in leftover array thing it will be from 69
        
        System.out.println("Max value is " + max);
    }
}

