package sorting;
import java.util.*;

public class QuickSort {

    static void printArray(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for( int i =0; i<n; i++)
            arr[i] = sc.nextInt();
        new Solution().quickSort(arr, 0, n);
        printArray(arr);
        sc.close();
    }    
}

class Solution {
    //Function to sort an array using quick sort algorithm.
    void quickSort(int arr[], int low, int high) {
        // code here
    }
    static int partition(int arr[], int low, int high) {
        // your code here

        return 0;
    } 
}