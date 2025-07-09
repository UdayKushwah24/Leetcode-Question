package Leetcode.LogicalQuestion;

public class XORoperation_1486 {
    
    public static int xorOperation(int n, int start) {
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans ^= start;
            start = start + 2;
             
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int n = 5, start = 0;
        System.out.println(xorOperation(n, start));
    }
}
