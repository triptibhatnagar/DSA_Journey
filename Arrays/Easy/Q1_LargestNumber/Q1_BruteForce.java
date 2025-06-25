package Arrays.Easy.Q1_LargestNumber;

import java.util.Arrays;

public class Q1_BruteForce {
    // approach - sort and return last element
    // T: O(n logn)
    // S: O(1)
    static int largestNum(int arr[]) {
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public static void main(String[] args) {
        int arr[] = {5,1,8,2,3,4};
        System.out.println(largestNum(arr));
    }
}
