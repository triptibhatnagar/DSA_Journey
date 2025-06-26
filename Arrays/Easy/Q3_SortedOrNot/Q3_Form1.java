package Arrays.Easy.Q3_SortedOrNot;

public class Q3_Form1 {
    // form1 : given that, array must be sorted in ascending order, tell if array is sorted or not

    // check for ascending, write descending condition
    static boolean isAsc(int arr[]) {
        for(int i=0; i<arr.length-1; i++) {
            if (arr[i] > arr[i+1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,0};
        System.out.println(isAsc(arr));
    }
}