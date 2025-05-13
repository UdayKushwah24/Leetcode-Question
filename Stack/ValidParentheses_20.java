package Leetcode.Stack;

import java.util.Stack;

public class ValidParentheses_20 {

    
  /* 
    public static boolean IsValid(String s) {
        while (s.length() > 0) {
            if(s.contains("()")) {
                s = s.replace("()", "");
            } else if(s.contains("[]")) {
                s = s.replace("[]", "");
            } else if(s.contains("{}")) {
                s = s.replace("{}", "");
            } else {
                break;
            }
        }
        // if (s.length() == 0) {
        //     return true;
        // } else {
        //     return false;
        // }

        return s.length() == 0;
        
    }
    public static void main(String[] args) {
        String s = "()[][{}";
        System.out.println(IsValid(s));
        // System.out.println(s.contains("()"));  // true
    } 
        
    */


    public static boolean IsValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // opening
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                // closing
                if (('(' == stack.peek() && ch == ')') ||
                        ('[' == stack.peek() && ch == ']') ||
                        ('{' == stack.peek() && ch == '}')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        String s = "()[]{(})";
        System.out.println(IsValid(s));
        // System.out.println(s.contains("()")); // true
    }

}
