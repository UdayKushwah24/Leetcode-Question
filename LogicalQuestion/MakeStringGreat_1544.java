package Leetcode.LogicalQuestion;

import java.util.Stack;

public class MakeStringGreat_1544 {

    /*
     * public static String makeGood(String s) {
     * 
     * for (int i = 0; i < s.length(); i++) {
     * 
     * while (i < s.length()-1 &&( (int) (s.charAt(i)) - (int) (s.charAt(i + 1)) ==
     * 32 || (int)(s.charAt(i)) - (int) (s.charAt(i + 1)) == -32)){
     * s = s.replace(s.charAt(i) + "" + s.charAt(i + 1), "");
     * i++;
     * }
     * }
     * for (int i = 1; i < s.length(); i++) {
     * while (i < s.length() && ((int) (s.charAt(i-1)) - (int) (s.charAt(i )) == 32
     * || (int) (s.charAt(i-1)) - (int) (s.charAt(i )) == -32)) {
     * s = s.replace(s.charAt(i-1) + "" + s.charAt(i ), "");
     * i++;
     * }
     * }
     * 
     * return s;
     * }
     */

    public static String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (!stack.isEmpty() && Math.abs(s.charAt(i) - stack.peek()) == 32) {

                stack.pop();

            } else {

                stack.push(s.charAt(i));
            }

        }
        System.out.println(stack);
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.insert(0, stack.pop());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "leEeetcode";
        // String s = "abBAcC";
        System.out.println(makeGood(s));
        // System.out.println('A' - 'a');
    }
}
