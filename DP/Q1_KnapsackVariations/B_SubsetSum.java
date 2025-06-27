package DP.Q1_KnapsackVariations;

public class B_SubsetSum {
    static boolean subsetSum(int arr[], int sum, int n) {
        boolean t[][] = new boolean[n+1][sum+1];
        // initialization
        for(int i=0; i<n+1; i++) {
            for(int j=0; j<sum+1; j++) {
                if(i == 0) t[i][j] = false;
                else if(j == 0) t[i][j] = true;
                else if(arr[i-1] <= j) {
                    // t[i][j] = val[i-1] + W - wt[i-1] 
                    t[i][j] = t[i-1][j-arr[i-1]] || t[i-1][j];
                }else {
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][sum];
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,5};
        int sum = 10;
        System.out.println(subsetSum(arr, sum, arr.length));
    }
}
