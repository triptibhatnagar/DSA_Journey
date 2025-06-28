package Arrays.Easy.Q7_RightRotate;

import java.util.Arrays;

public class Q7_BruteForce {
    static int[] rightRotByN(int arr[], int k) {
        int n = arr.length;
        int temp[] = new int[k];
        for(int i=n-k; i<n; i++) {
            temp[i-(n-k)] = arr[i];
        }
        for(int i=n-k-1; i>=0; i--) {
            arr[i+k] = arr[i];
        }
        for(int i=0; i<k; i++) {
            arr[i] = temp[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int k = 3;
        System.out.println(Arrays.toString(rightRotByN(arr, k)));
    }
}