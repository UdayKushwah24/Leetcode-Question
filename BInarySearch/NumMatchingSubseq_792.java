package Leetcode.BInarySearch;

public class NumMatchingSubseq_792 {


    public static boolean isSub(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();

    }

    public static int numMatchingSubseq(String s, String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (isSub(words[i], s)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "abcde";
        String words[] = { "a", "bb", "acd", "ace" };
        System.out.println(numMatchingSubseq(s, words));
    }
}
