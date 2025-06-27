package DP.Q1_KnapsackVariations;

public class A_Knapsack {
    // RECURSIVE
    static int knapsack1(int wt[], int val[], int W, int n) {
        // base case
        if(n == 0 || W == 0) return 0;
        // choice diagram
        if(wt[n-1] <= W) {
            // max profit from inclusion and exclusion
            return Math.max(val[n-1]+knapsack1(wt, val, W-wt[n-1], n-1), knapsack1(wt, val, W, n-1));
        }
        return knapsack1(wt, val, W, n-1);
    }


    // MEMOIZATION
    // constraints: n <= 100 , W <= 1000
    
    // static int t[][] = new int[102][1002];
    static int knapsack2(int wt[], int val[], int W, int n, int t[][]) {
        for(int i=0; i<102; i++) {
            for(int j=0; j<1002; j++) {
                t[i][j] = -1;
            }
        }
        // base case
        if(n == 0 || W == 0) return 0;
        // if value is not -1, return that value
        if(t[n][W] != -1) return t[n][W];
        if(wt[n-1] <= W) {
            return t[n][W] = Math.max(val[n-1]+knapsack2(wt, val, W-wt[n-1], n-1, t), knapsack2(wt, val, W, n-1, t));
        }
        // else if(wt[n-1] > W) 
        return t[n][W] = knapsack2(wt, val, W, n-1, t);
    }
    

    // TABULATION
    static int knapsack3(int wt[], int val[], int W, int n) {
        int t[][] = new int[n+1][W+1];
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < W+1; j++) {
                if(i == 0 || j == 0) 
                    t[i][j] = 0;
                // n - i, W - j
                else if(wt[i-1] <= j) {
                    t[i][j] = Math.max(val[i-1]+t[i-1][j-wt[i-1]], t[i-1][j]);
                }else  {
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][W];
    }
    public static void main(String[] args) {
        int wt[] = {1,3,4,5};
        int val[] = {1,4,5,7};
        int W = 7;
        int n = wt.length;
        int t1[][] = new int[102][1002];
        System.out.println(knapsack1(wt, val, W, n));
        System.out.println(knapsack2(wt, val, W, n, t1));
        System.out.println(knapsack3(wt, val, W, n));
    }
}