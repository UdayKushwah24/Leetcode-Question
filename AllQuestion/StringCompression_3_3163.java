package Leetcode.AllQuestion;

public class StringCompression_3_3163 {
    public static String compressedString(String word) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int count = 1;
            while (i < word.length() - 1 && ch == word.charAt(i + 1)) {
                count += 1;
                i++;
            }
            while (count > 9) {
                sb.append(9);
                sb.append(ch);
                count -= 9;
            }
            if (count <= 9) {
                sb.append(count);
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        // String word = "abcde";
        String word = "aaaaaaaaaaaaaabb";
        System.out.println(compressedString(word));
    }
}
