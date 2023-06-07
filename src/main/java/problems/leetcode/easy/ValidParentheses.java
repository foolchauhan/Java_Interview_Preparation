/**
 * https://leetcode.com/problems/valid-parentheses/
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 * 
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 */
package problems.leetcode.easy;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
    public static boolean isValidParentheses(String s) {
        Stack<Character> st = new Stack<Character>();
        for (char c : s.toCharArray()){
            if (c == '{') {
                st.push('}');
            }
            else if (c == '(') {
                st.push(')');
            }
            else if (c == '[') {
                st.push(']');
            }
            else if(st.isEmpty() || st.pop() != c){
                return false;
            }
        }
        return st.isEmpty();
    }

    public static boolean isValid(String s) {
        if(s.length()%2 != 0) {
            return false;
        }
        HashMap<Character, Character> dict1 = new HashMap<Character, Character>();
        HashMap<Character, Character> dict2 = new HashMap<Character, Character>();
        dict1.put('[', ']');
        dict2.put(']', '[');
        dict1.put('{', '}');
        dict2.put('}', '{');
        dict1.put('(', ')');
        dict2.put(')', '(');
        Stack<Character> st = new Stack<Character>();
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            if (dict1.keySet().contains(ch)){
                st.add(ch);
            }
            if (dict2.keySet().contains(ch)){
                if (!st.empty() && st.peek() == dict2.get(ch)) {
                    st.pop();
                }
                else {
                    st.add(ch);
                }
            }
        }
        return st.empty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // String str = "[{}][({}])";
        // String str = "[{}][({})]";
        // String str = "}(";
        // boolean result = isValid( str);
        boolean result = isValidParentheses( str);
        System.out.println(result);
        sc.close();
    }
}
