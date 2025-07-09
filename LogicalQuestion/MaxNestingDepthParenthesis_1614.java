package Leetcode.LogicalQuestion;

import java.util.*;

public class MaxNestingDepthParenthesis_1614 {

    public static int maxDepth(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == ')') {
                stack.push(s.charAt(i));
            }
        }

        System.out.println(stack);
        int ans1 = 0;

        int c1 = 0;
        for (char ch : stack) {
            if (ch == '(') {
                c1++;
            }
            if (ch == ')') {
                ans1 = Math.max(ans1, c1);
                c1 = 0;
            }
        }
         
        int p = 0;
        int ans = 0;
        for (int i = 0; i < stack.size(); i++) {
            int c = 0;
            int q = 0;
            while (stack.peek() == '(') {
                c++;
                i++;
                stack.pop();
            }
            while (stack.peek() == ')') {
                i++;
                q++;
                stack.pop();
            }
            p = Math.max(ans, q);
            ans = Math.max(ans, c);
        }

        return Math.max(p, ans);
    }

    public static void main(String[] args) {
        // String s = "()(())((()()))";
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println(maxDepth(s));
    }
}
