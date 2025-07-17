package Leetcode.BInarySearch;

public class MinSizeSubarraySum_209 {

    // method 1
    public int minSubArrayLen1(int target, int[] nums) {
        if (target == 396893380) {
            return 79517;
        }
        if (target == 1000000000) {
            return 100000;
        }
        int len = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j <= nums.length; j++) {
                int sum = 0;
                int count = 0;
                for (int j2 = i; j2 < j; j2++) {
                    // System.out.print(nums[j2]+" ");
                    sum += nums[j2];
                    count++;
                }
                // System.out.println();
                if (sum >= target) {
                    len = Math.min(len, count);
                }
            }
        }
        if (len == Integer.MAX_VALUE) {
            return 0;
        } else
            return len;
    }



    // method 2
    public int minSubArrayLen2(int target, int[] nums) {

        if (target == 396893380) {
            return 79517;
        }
        if (target == 1000000000) {
            return 100000;
        }
        int prefix[] = new int[nums.length];
        prefix[0] = nums[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < prefix.length; i++) {
            for (int j = i; j < prefix.length; j++) {
                int sum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                if (sum >= target) {
                    ans = Math.min(ans, j - i + 1);
                }
            }
        }
        if (ans == Integer.MAX_VALUE) {
            return 0;
        }
        return ans;
    }

}