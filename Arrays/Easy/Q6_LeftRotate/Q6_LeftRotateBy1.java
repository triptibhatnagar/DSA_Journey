package Arrays.Easy.Q6_LeftRotate;

import java.util.Arrays;

public class Q6_LeftRotateBy1 {
    static int[] leftRotBy1(int arr[]) {
        int n = arr.length;
        int temp = arr[0];
        for(int i=1; i<arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        System.out.println(Arrays.toString(leftRotBy1(arr)));
    }
}