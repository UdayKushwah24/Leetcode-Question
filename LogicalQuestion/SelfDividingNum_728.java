package Leetcode.LogicalQuestion;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNum_728 {

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ll = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (check(i)) {
                ll.add(i);
            }
        }
        return ll;
    }

    private static boolean check(int num) {
        int n = num;
        while (num > 0) {
            int last = num % 10;
            if (last == 0) {
                return false;
            }
           if (n % last != 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        int left = 47, right = 85;
        System.out.println(selfDividingNumbers(left, right));
    }
}
