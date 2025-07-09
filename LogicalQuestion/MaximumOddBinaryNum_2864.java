package Leetcode.LogicalQuestion;

public class MaximumOddBinaryNum_2864 {


    public static String maximumOddBinaryNumber(String s) {
        int count0 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                count0 += 1;
            }
        }
        int count1 = s.length() - count0;
        
        StringBuilder sb = new StringBuilder();
        if (count1 > 0) {
            sb.insert(0, 1);
            count1 = count1 - 1;
        }
        
        while (count0 > 0) {
            sb.insert(0, 0);
            count0 = count0 - 1;
        }
        while (count1 > 0) {
            sb.insert(0, 1);
            count1 = count1 - 1;
        }
        return sb.toString();

    }
    public static void main(String[] args) {
        String s = "0101";
        System.out.println(maximumOddBinaryNumber(s));
    }
}
