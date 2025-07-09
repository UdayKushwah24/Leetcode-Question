package Leetcode.LogicalQuestion;

 
public class SecondLargestDigit_1796 {
    public static int secondHighest(String s) {
        int max = -1;
        int secondMax = -1;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                int digit = c - '0';
                if (digit > max) {
                    secondMax = max;
                    max = digit;
                } else if (digit < max && digit > secondMax) {
                    secondMax = digit;
                }
            }
        }

        return secondMax;
    }

    public static void main(String[] args) {
        String s = "dfa12321afd";
        System.out.println(secondHighest(s));
    }
}
