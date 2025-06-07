package Leetcode.AllQuestion;

public class WaysExpressSumPower_2787 {

    public static boolean isPossible(int n, int i, int x) {

        int remain = (int)Math.pow(i, x);
        int nKiPowxminusRemain = n - remain;

        for (int j = 0; j <= nKiPowxminusRemain; j++) {
            int pow = (int)Math.pow(j, x);
            if (pow == nKiPowxminusRemain) {
                return true;
            }
        }
        return false;
    }

    public static int numberOfWays(int n, int x) {
        int c = 0;
        for (int i = 0; i <= n; i++) {
            if (isPossible(n, i, x)) {
                
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int n = 10, x = 2;
        System.out.println(numberOfWays(n, x));
    }
}
