package Arrays.Easy.Q2_SecondLargest;

public class Q2_Optimal {
    // approach: one loop
    // T: O(n)
    // S: O(1)
    static int secLargest(int arr[]) {
        if(arr.length == 0) return -1;
        int largest = arr[0];
        int secLargest = Integer.MIN_VALUE;
        for(int i=1; i<arr.length; i++) {
            if(arr[i] > largest) {
                secLargest = largest;
                largest = arr[i];
            }else if(arr[i] > secLargest && arr[i] != largest) {
                secLargest = arr[i];
            }
        }
        return secLargest;
    }
    public static void main(String[] args) {
        int arr[] = {9,5,1,8,2,3,4};
        System.out.println(secLargest(arr));
    }
}
