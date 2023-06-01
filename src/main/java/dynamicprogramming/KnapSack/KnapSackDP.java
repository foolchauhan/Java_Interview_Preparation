package dynamicprogramming.KnapSack;

public class KnapSackDP {
    
    public static void main(String[] args) {
        int wt[] = {1, 2, 7, 5};
        int val[] = {1, 4, 7, 5};
        int W = 7;
        int n = 4; // size of array
        int result = knapSack(wt, val, W, n);
        System.out.println(result);
    }

    public static int knapSack(int[] wt, int[] val, int W, int n) {
        int dp[][] = new int[n+1][W+1];
        for(int i=0; i<=n; i++) {
            for(int j=0; j<=W; j++) {
                if(i==0 || j==0) 
                    dp[i][j] = 0;
                else if(wt[i-1] > j)
                    dp[i][j] = dp[i-1][j];
                else
                    dp[i][j] = Math.max(val[i-1] + dp[i-1][j-wt[i-1]], dp[i-1][j]);
            }
        }
        return dp[n][W];
    }
}
