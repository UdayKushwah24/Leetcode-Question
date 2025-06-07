package Leetcode.AllQuestion;

public class validPalindrome_680 {

    public static boolean CheckPalindrome(String s) {
        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length()-1-i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean validPalindrome(String s) {
        boolean ans = false;
        if (CheckPalindrome(s)) {
            return true;
        } else {
            for (int i = 0; i < s.length(); i++) {
                String s1 = s.substring(0, i);
                String s2 = s.substring(i+1);
                if(CheckPalindrome(s1+s2)) {
                    ans = true;
                    break;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "aba";
        System.out.println(validPalindrome(s));
    }
}
