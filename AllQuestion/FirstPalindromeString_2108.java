package Leetcode.AllQuestion;

public class FirstPalindromeString_2108 {
    public static boolean CheckPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static String firstPalindrome(String[] words) {
        for (int i = 0; i < words.length; i++) {
            if (CheckPalindrome(words[i])) {
                return words[i];
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String[] words = { "abc", "car", "ada", "racecar", "cool" };
        System.out.println(firstPalindrome(words));
    }
}
