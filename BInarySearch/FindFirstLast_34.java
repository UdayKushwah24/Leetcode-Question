package Leetcode.BInarySearch;

public class FindFirstLast_34 {
  /*   public static int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = findFirst(nums, target);
        ans[1] = findLast(nums, target);
        return ans;
    }

    private static int findFirst(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1, first = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] == target) {
                first = mid;
                hi = mid - 1;
            } else if (nums[mid] < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return first;
    }

    private static int findLast(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1, last = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] == target) {
                last = mid;
                lo = mid + 1;
            } else if (nums[mid] < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return last;
    } */

    public static int[] searchRange(int[] nums, int target) {

        int[] ans = { -1, -1 };
        int idx = -1; 
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                idx = i;
                break;
            }
        }
        if ( idx == -1) {
            return ans;
        }
        ans[0] = idx;
        
        // Find the last occurrence
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == target) {
                ans[1] = i; // set end index
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // int[] nums = { 1 };
        // int target = 1;
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] ans = searchRange(nums, target);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
