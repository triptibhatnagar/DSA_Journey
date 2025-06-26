package Arrays.Easy.Q2_SecondLargest;

import java.util.Arrays;

public class Q2_BruteForce {
    // approach: sort and return elem from second last which is not equal to last elem
    // T: O(nlogn)
    // S: O(1)
    static int secLargest(int arr[]) {
        Arrays.sort(arr);
        for(int i=arr.length-2; i>=0; i--) {
            if(arr[i] != arr[arr.length-1]) return arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {9,5,1,8,2,3,4};
        System.out.println(secLargest(arr));
    }
}