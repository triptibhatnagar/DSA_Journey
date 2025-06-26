package Arrays.Easy.Q5_LinearSearch;

public class Q5_Form1 {
    static int linearSearch(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {5,9,1,4,2,0,2};
        int target = 2;
        System.out.println(linearSearch(arr, target));
    }
}
