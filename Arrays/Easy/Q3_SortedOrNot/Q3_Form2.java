package Arrays.Easy.Q3_SortedOrNot;

public class Q3_Form2 {
    // form2 : given that, array must be sorted in descending order, tell if array is sorted or not

    // check for descending, write ascending condition
    static boolean isDesc(int arr[]) {
        for(int i=0; i<arr.length-1; i++) {
            if (arr[i] < arr[i+1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {3,2,1,0};
        System.out.println(isDesc(arr));
    }
}