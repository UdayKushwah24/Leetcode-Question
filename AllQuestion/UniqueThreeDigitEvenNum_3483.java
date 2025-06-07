package Leetcode.AllQuestion;

import java.util.ArrayList;
import java.util.List;

public class UniqueThreeDigitEvenNum_3483 {
    public static int totalNumbers(int[] digits) {
        List<Integer> ll = new ArrayList<>();
        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                for (int k = 0; k < digits.length; k++) {
                    if (i != j && j != k && k != i) {
                        int d1 = digits[i];
                        int d2 = digits[j];
                        int d3 = digits[k];
                        int threeDigitNum = d1 * 100 + d2 * 10 + d3;
                        if (d1 != 0 && d3 % 2 == 0) {
                            if(!ll.contains(threeDigitNum)) {
                                ll.add(threeDigitNum);
                            }
                        }
                    }
                }
            }
        }
        System.out.println(ll);
        return ll.size();
    }

    public static void main(String[] args) {
        int[] digits = { 1, 2, 3, 4 };
        System.out.println(totalNumbers(digits));
    }
}
