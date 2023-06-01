package dynamicprogramming.KnapSack;
import java.lang.Math;
/*
 * This is a recursive solution to 0/1 Knapsack Problem (basic).
 * Inputs : Weight Array wt[] - [1, 3, 4, 5]
 *          Value Array val[] - [1, 4, 5, 7]
 *          Kapnsack Capacity W - 7
 * Output : Maximum Profit
 */
public class Knapsack_Recursive {
    public static void main(String[] args) {
        int wt[] = {1, 2, 7, 5};
        int val[] = {1, 4, 7, 5};
        int W = 7;
        int n = 4; // size of array
        int result = knapsack(wt, val, W, n);
        System.out.println(result);
    }

    private static int knapsack(int[] wt, int[] val, int W, int n){
        if (n==0 || W == 0) {
            return 0;
        }
        if (wt[n-1] <= W) {
            return Math.max((val[n-1]+knapsack(wt, val, W-wt[n-1], n-1)), knapsack(wt, val, W, n-1));
        }
        return knapsack(wt, val, W, n-1);
    }
}
