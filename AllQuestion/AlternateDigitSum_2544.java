package Leetcode.AllQuestion;

import java.util.ArrayList;
import java.util.List;

public class AlternateDigitSum_2544 {
/*     public static int alternateDigitSum(int n) {

        List<Integer> ll = new ArrayList<>();
        while (n > 0) {
            ll.add(0, n % 10);
            n /= 10;
        }
        int sumPositive = 0;
        int sumNegative = 0;
        for (int i = 0; i < ll.size(); i++) {
            if (i % 2  == 0) {
                sumPositive += ll.get(i);
            } else {
                sumNegative += ll.get(i);
                
            }
        }
        return sumPositive - sumNegative;
    }
 */


    public static int alternateDigitSum(int n) {
        String str = n+"";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            int digit = str.charAt(i)-'0';
            sum += (i % 2 == 0) ? digit : -digit;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n = 521;
        System.out.println(alternateDigitSum(n));
    }
}
