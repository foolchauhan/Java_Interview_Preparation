package dynamicprogramming.KnapSack;

public class Knapsack_Memoization {
    static int[][] t;

    public static void main(String[] args) {
        int wt[] = {1, 2, 7, 5};
        int val[] = {1, 4, 7, 5};
        int W = 7;
        int n = 4; // size of array
        int result = knapSack(wt, val, W, n);
        System.out.println(result);
    }

    public static int knapSack(int[] wt, int[] val, int W, int n) {
        t = new int[n+1][W+1];

        for( int i=0; i <=n; i++) {
            for(int j=0; j<=W; j++){
                t[i][j] = -1;
            }
        }
        return knapSackHelper(wt, val, W, n);
        
    }

    private static int knapSackHelper(int[] wt, int[] val, int W, int n) {

        if (n==0 || W == 0) {
            return 0;
        }
        if(t[n][W] != -1){
            return t[n][W];
        }

        if (wt[n-1] <= W) {
            t[n][W] = Math.max((val[n-1]+knapSackHelper(wt, val, W-wt[n-1], n-1)), knapSackHelper(wt, val, W, n-1));
        }
        else {
            t[n][W] = knapSackHelper(wt, val, W, n-1);
        }
        return t[n][W];
    }
    
}
