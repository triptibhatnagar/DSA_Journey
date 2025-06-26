package Arrays.Easy.Q3_SortedOrNot;

public class Q3_Form3 {
    // form3 : given that, array can be sorted in ascending or descending order, tell if array is sorted or not

    // check for ascending, write descending condition
    // check for descending, write ascending condition
    static boolean isSorted(int arr[]) {
        boolean isAsc = true;
        boolean isDesc = true;
        for(int i=0; i<arr.length-1; i++) {
            if (arr[i] > arr[i+1]) {
                isAsc = false;
            }else if(arr[i] < arr[i+1]) {
                isDesc = false;
            }
        }
        if(isAsc || isDesc) return true;
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {3,4,1,0};
        System.out.println(isSorted(arr));
    }
}
