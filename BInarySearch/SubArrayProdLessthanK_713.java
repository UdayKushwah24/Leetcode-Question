package Leetcode.BInarySearch;

public class SubArrayProdLessthanK_713 {
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j =i+1 ; j < nums.length; j++) {
                int p = 1;
                for (int j2 = i; j2 < j; j2++) {
                    p *= nums[j2];
                }
                if (p < k) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = { 10, 9, 10, 4, 3, 8, 3, 3, 6, 2, 10, 10, 9, 3};
        int k = 19;
        // int[] nums = {10,5,2,6};
        // int k = 100;
        System.out.println(numSubarrayProductLessThanK(nums, k));
    }
}
