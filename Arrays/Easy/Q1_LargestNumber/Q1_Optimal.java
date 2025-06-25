package Arrays.Easy.Q1_LargestNumber;

public class Q1_Optimal {

    static int largestNum(int arr[]) {
        // approach - loop and compare if any element occurs greater than largest till then
        // T: O(n)
        // S: O(1)
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[] = {5,1,8,2,3,4};
        System.out.println(largestNum(arr));
    }
}
