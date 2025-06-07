package Leetcode.AllQuestion;

public class FactTraillingZeros_172 {
    public static int trailingZeroes(int n) {
        int p = n;   
        if(n == 0) {
            return 0;
        }
        
        int c2 = 0;
        int temp = n;   
        
        while(temp > 0) {
            temp /= 2;
            c2 += temp;
        }
        
        int c5 = 0;
        temp = p;  
        while(temp > 0) {
            temp /= 5;
            c5 += temp;
        }
        
        return Math.min(c2, c5);
    }

    public static void main(String[] args) {
        int n = 39;
        System.out.println(trailingZeroes(n));
    }
}
