package Leetcode.AllQuestion;

public class SomOfNumAndReverse_2443 {

    public static boolean sumOfNumberAndReverse(int num) {
        boolean ans = false;
        for (int i = 0; i <= num; i++) {
            int rev = num-i;
            if (CheckRevSum(i, rev)) {
                ans = true;
                break;
            }
        }
        return ans;
    }

    public static boolean CheckRevSum(int i, int rev) {
        int r = 0;
        while (rev > 0) {
            int rem = rev % 10;
            r = r*10+rem;
            rev /= 10;
        }
        return r == i;
    }

    public static void main(String[] args) {
        int num = 443;
        System.out.println(sumOfNumberAndReverse(num));
    }
}
