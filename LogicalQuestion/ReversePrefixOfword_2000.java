package Leetcode.LogicalQuestion;

public class ReversePrefixOfword_2000 {
    public static String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        boolean flag = true;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != ch) {
                sb.insert(0, word.charAt(i));
            } else {
                sb.insert(0, word.charAt(i));
                idx = i;
                flag = false;
                break;
            }
        }
        // System.out.println(idx);
        if (flag) {
            return word;
        }

        String rem = word.substring(idx+1);
        return sb.toString() + rem;


    }

    public static void main(String[] args) {
        String word = "xyxzxe";
        char ch = 'a';
        System.out.println(reversePrefix(word, ch));
    }
}
