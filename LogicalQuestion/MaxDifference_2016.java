package Leetcode.LogicalQuestion;

public class MaxDifference_2016 {

    public static int maximumDifference(int[] nums) {
        int ans = -1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    ans = Math.max(ans, nums[j] - nums[i]);
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = { 1, 5, 2, 10 };
        System.out.println(maximumDifference(nums));
    }
}
