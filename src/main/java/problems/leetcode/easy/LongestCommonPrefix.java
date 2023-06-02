/**
 * https://leetcode.com/problems/longest-common-prefix/
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 */
package problems.leetcode.easy;

import java.util.ArrayList;
import java.util.Scanner;

public class LongestCommonPrefix {
    

    static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0){
            return "";
        }
        String prefix = strs[0];
        for (int i=1;i<strs.length;i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix=prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strs = new String[n];
        for (int i=0; i<n; i++){
            strs[i] = sc.next();
        }
        String result = longestCommonPrefix( strs);
        System.out.println(result);
        sc.close();
    }

}
