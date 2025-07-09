package Leetcode.LogicalQuestion;

public class CountOddNum_1523 {

    public static int countOdds(int low, int high) {
        if (low %2 == 0) {
            low = low + 1;
        }
        if (high % 2 == 0) {
            high = high - 1;
        }

        

        
        return (high - low )/2+1;
    }
    public static void main(String[] args) {
        int low = 3;
        int high = 7;
        System.out.println(countOdds(low, high));
    }
}
