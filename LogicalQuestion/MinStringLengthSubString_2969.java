package Leetcode.LogicalQuestion;

public class MinStringLengthSubString_2969 {
    public static int minLength(String s) {
        while (s.contains("AB") || s.contains("CD")) {
            s = s.replace("AB", "");
            s = s.replace("CD", "");
        }
        System.out.println(s);
        return s.length();
    }

    public static void main(String[] args) {
        String s = "ABFCACDB";
        System.out.println(minLength(s));
    }
}
