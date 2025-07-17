package Leetcode.BInarySearch;

public class GuessNumberHighLow_374 {

    


    public  static int guessNumber(int n) {
        int lo = 0;
        int hi = n; 
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (guess(mid) == 0) {
                return mid;
            } else if(guess(mid) == -1) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return -1;
    }

    private static int guess(int guess) {
        int pick = 6;
        if (guess > pick) {
            return -1;
        } else if (guess < pick) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(guessNumber(n));
    }
}
