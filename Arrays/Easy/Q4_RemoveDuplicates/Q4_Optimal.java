package Arrays.Easy.Q4_RemoveDuplicates;

public class Q4_Optimal {
    // approach - 2 pointers
    // i : till i, all unique elements
    // j : from j, checking each elem
    static int removeDuplicates(int arr[]) {
        int i = 0;
        for(int j=1; j<arr.length; j++) {
            if(arr[i] != arr[j]) {
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,1,2,3,4,4,5};
        System.out.println(removeDuplicates(arr));
    }
}