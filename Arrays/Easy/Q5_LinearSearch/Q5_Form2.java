package Arrays.Easy.Q5_LinearSearch;

import java.util.List;
import java.util.ArrayList;

public class Q5_Form2 {
    static List<Integer> linearSearch(int arr[], int target) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                ans.add(i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {5,9,1,4,2,0,2};
        int target = 2;
        System.out.println(linearSearch(arr, target));
    }
}
