package Leetcode.Stack;

public class LongestValidParenthesis_32 {

    public static int LongestParenthesis(String s) {
        int n = s.length();
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
        System.out.println(s);
        int m = s.length();
        System.out.println(m);
        return (n-m);

    }
    public static void main(String[] args) {
        String s = "{{(()}}";
        System.out.println(LongestParenthesis(s));
    }
}
