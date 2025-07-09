package Leetcode.LogicalQuestion;

public class ShuffleString_1528 {
    public static String restoreString(String s, int[] indices) {
        StringBuilder sb = new StringBuilder();
        char[] ans = new char[s.length()];
        for (int i = 0; i < indices.length; i++) {
            ans[indices[i]] = s.charAt(i);
        }
        for (char c : ans) {
            sb.append(c);
        }
        
        return sb.toString();
        
    }
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = { 4, 5, 6, 7, 0, 2, 1, 3 };
        System.out.println(restoreString(s, indices));
    }
}
