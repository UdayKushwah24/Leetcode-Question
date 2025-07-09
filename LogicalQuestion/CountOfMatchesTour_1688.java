package Leetcode.LogicalQuestion;

public class CountOfMatchesTour_1688 {


    public static int numberOfMatches(int n) {
        int matches = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                matches += n / 2;
            } else {
                matches += (n - 1) / 2 + 1;
            }
            n /= 2;
        }
        return matches;
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println(numberOfMatches(n));
    }
}
