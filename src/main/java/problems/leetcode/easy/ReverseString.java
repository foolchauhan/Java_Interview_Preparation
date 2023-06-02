/**
 * https://leetcode.com/problems/reverse-string/
 */
package problems.leetcode.easy;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] result = reverseString(s.toCharArray());
        System.out.println(result);
        sc.close();
    }

    public static char[] reverseString(char[] s) {
        int left = 0;
        int right = s.length-1;
        while(left<right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        return s;
    }
}

