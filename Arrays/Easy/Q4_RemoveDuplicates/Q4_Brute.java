package Arrays.Easy.Q4_RemoveDuplicates;

import java.util.HashSet;

public class Q4_Brute {
    // approach: duplicate/ unique -> HashSet
    // return the no of unique elements in the array
    // T: O(n logn + n)
    // S: O(n)
    static int removeDuplicates(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int idx = 0;
        int uniq = set.size();
        for(int x: set) {
            arr[idx++] = x;
        }
        return uniq;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,1,2,3,4,4,5};
        System.out.println(removeDuplicates(arr));
    }
}
