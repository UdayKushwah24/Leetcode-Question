package Leetcode.LogicalQuestion;

public class CalDigitSumString_2243 {
    public static String digitSum(String s, int k) {
        while (s.length() > k) {
            int i = 0;
            StringBuilder temp = new StringBuilder();
            while (i < s.length()) {
                int count = 0;
                int t = 0;
                while (i < s.length() && t < k) {
                    count += s.charAt(i) - '0';
                    t++;
                    i++;
                }
                temp.append(count);
            }
            s = temp.toString();
        }
        return s;
    }
    // public static String digitSum(String s, int k) {
    //     int i = 0;
    //     String temp = "";
    //     // StringBuilder sb = new StringBuilder();
    //     while (s.length() >= 0) {
    //         int count = 0;
    //         int t = 0;
    //         while (i < s.length() && t < k) {
    //             count += s.charAt(i) - '0';
    //             t++;
    //             i++;
    //         }
    //         temp += count;
    //         if (s.length() == k) {
    //             break;
    //         }
    //         if (i == s.length() - 1) {
    //             s = temp;
    //             i = 0;
    //             temp = "";
    //         }

    //     }
    //     // System.out.println(s);
    //     System.out.println(1);
    //     return s;
    // }
    public static void main(String[] args) {
        String s = "11111222223";
        int k = 3;
        System.out.println(digitSum(s, k));
    }
}
