package Leetcode.LogicalQuestion;

public class SumSquareNumber_633 {
    
        public static boolean judgeSquareSum(int c) {
            long left = 0, right = (long) Math.sqrt(c); // Use long to avoid overflow

            while (left <= right) {
                long sum = left * left + right * right;
                if (sum == c)
                    return true;
                else if (sum < c)
                    left++;
                else
                    right--;
            }

            return false;
        }
    
    
    public static void main(String[] args) {
        int c = 5;
        int s = (int) (Math.sqrt(17));
        System.out.println(s);
        System.out.println(judgeSquareSum(c));
    }
}
