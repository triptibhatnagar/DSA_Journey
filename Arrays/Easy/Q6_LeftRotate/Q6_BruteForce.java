package Arrays.Easy.Q6_LeftRotate;

import java.util.Arrays;

public class Q6_BruteForce {
    static int[] leftRotByN(int arr[], int k) {
        int n = arr.length;
        int temp[] = new int[k];
        for(int i=0; i<k; i++) {
            temp[i] = arr[i];
        }
        for(int i=k; i<n; i++) {
            arr[i-k] = arr[i];
        }
        for(int i=n-k; i<n; i++) {
            arr[i] = temp[i-(n-k)];
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int k = 3;
        System.out.println(Arrays.toString(leftRotByN(arr, k)));
    }
}
