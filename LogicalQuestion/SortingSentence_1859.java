package Leetcode.LogicalQuestion;

public class SortingSentence_1859 {
    public static String sortSentence(String s) {
        String[] arr = s.split(" ");
        String[] ans = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int idx = arr[i].charAt(arr[i].length() - 1) - '0';
            ans[idx - 1] = arr[i].substring(0, arr[i].length() - 1);
        }
        StringBuilder sb = new StringBuilder();
        for (String string : ans) {
            sb.append(string);
            sb.append(" ");
        }
        
        // sb.append(" ");
        return sb.toString().substring(0,sb.toString().length()-1);
    }

    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }
}
