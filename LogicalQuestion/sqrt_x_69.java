package Leetcode.LogicalQuestion;

 
public class sqrt_x_69 {
    public static int mySqrt(int x) {
        int ans = 0;
        int start = 1;
        int end = x;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid * mid == x) {
                return mid;
            } else if (mid * mid < x) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int n = 8;
        System.out.println(mySqrt(n));
    }
}
