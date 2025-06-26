package Arrays.Easy.Q2_SecondLargest;

public class Q2_Better {
    // approach: 2-pass, i) find largest, ii) using largest, find second largest
    // T: O(2n)
    // S: O(1)
    static int secLargest(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int seclargest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > seclargest && arr[i] != largest) {
                seclargest = arr[i];
            }
        }
        return seclargest;
    }
    public static void main(String[] args) {
        int arr[] = {9,5,1,8,2,3,4};
        System.out.println(secLargest(arr));
    }
}
