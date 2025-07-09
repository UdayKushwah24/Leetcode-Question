package Leetcode.LogicalQuestion;

public class GuessNumHighLow_374 {



    public static int guessNumber(int n) {
        int start = 0;
        int end = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (guess(mid) == 0) {
                return mid;
            } else if (guess(mid) == -1) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    
    private static int guess(int mid) {
        int pick = 6;
        if (mid == pick)
            return 0;
        else if (mid > pick)
            return -1;
        else
            return 1;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(guessNumber(n));
    }
}
