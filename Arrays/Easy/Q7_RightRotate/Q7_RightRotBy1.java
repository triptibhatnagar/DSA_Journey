package Arrays.Easy.Q7_RightRotate;

import java.util.Arrays;

public class Q7_RightRotBy1 {
    static int[] rightRotBy1(int arr[]) {
        int n = arr.length;
        int temp = arr[n-1];
        // shifting backwards, so start from backwards to avoid overriding
        for(int i=arr.length-2; i>=0; i--) {
            arr[i+1] = arr[i];
        }
        arr[0] = temp;
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        System.out.println(Arrays.toString(rightRotBy1(arr)));
    }
}