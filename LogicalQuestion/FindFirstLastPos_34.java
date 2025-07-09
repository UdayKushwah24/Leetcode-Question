package Leetcode.LogicalQuestion;

public class FindFirstLastPos_34 {

    public int[] searchRange(int[] nums, int target) {
        int[] ans = { -1, -1 };
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                if (ans[0] == -1) {
                    ans[0] = mid;
                }
                ans[1] = mid;
            } else if (nums[mid] < target)
                low = mid + 1;
            else {
                high = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
