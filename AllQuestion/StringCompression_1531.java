package Leetcode.AllQuestion;

import java.util.Arrays;

public class StringCompression_1531 {
    public static int getLengthOfOptimalCompression(String word, int k) {
        char chArr[] = word.toCharArray();

        Arrays.sort(chArr);
        String str = String.valueOf(chArr);
        System.out.println(str);
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            char ch = str.charAt(i);
            while (i < str.length() - 1 && ch == word.charAt(i + 1)) {
                count++;
                i++;
            }

            if (k < count) {
                s.append(count);
                s.append(ch);
            }

        }
        System.out.println(s.toString());
        return s.toString().length();
    }
    public static void main(String[] args) {
        String s = "aabbaa";
        int k = 2;
        // String s = "aaabcccd";
        // int k = 2;
        System.out.println(getLengthOfOptimalCompression(s, k));
    }
}
