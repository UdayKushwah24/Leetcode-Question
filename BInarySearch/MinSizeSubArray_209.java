package Leetcode.BInarySearch;

 
public class MinSizeSubArray_209 {
    public static int minSubArrayLen(int target, int[] nums) {
        int prefix[] = new int[nums.length];
        prefix[0] = nums[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        for (int i = 0; i < prefix.length; i++) {
            System.out.print(prefix[i]+ " ");
        }

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < prefix.length; i++) {
            for (int j = i; j < prefix.length; j++) {
                int sum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                if (sum == target) {
                    ans = Math.min(ans,j - i +1);
                }
            }
        }
        if (ans == Integer.MAX_VALUE) {
            return 0;
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5 };
        int target = 12;
        // int nums[] = { 2, 3, 1, 2, 4, 3 };
        // int target = 7;
        System.out.println(minSubArrayLen(target, nums));
    }
}
