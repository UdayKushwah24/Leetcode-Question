package Leetcode.AllQuestion;

public class ReverseString_541 {
    public static String reverseStr(String s, int k) {

        if (s.length() < k) {
            String ans = "";
            for (int i = 0; i < s.length(); i++) {
                ans = s.charAt(i) + ans;
            }
        }

        String ans = s.substring(k);
        System.out.println(ans);
        for (int i = 0; i < k; i++) {
            ans = s.charAt(i) + ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        System.out.println(reverseStr(s, k));
    }
}
