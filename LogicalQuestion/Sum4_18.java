package Leetcode.LogicalQuestion;

import java.util.ArrayList; 
import java.util.Collections;
import java.util.List;

public class Sum4_18 {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    for (int l = k + 1; l < nums.length; l++) {
                        if (nums[i] + nums[j] + nums[k] + nums[l] == target ) {
                            List<Integer> ll = new ArrayList<>();
                            ll.add(nums[i]);
                            ll.add(nums[j]);
                            ll.add(nums[k]);
                            ll.add(nums[l]);
                            Collections.sort(ll);
                            if (!ans.contains(ll)) {
                                ans.add(ll);
                            }
                        }
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = { 2,2,2,2,2};
        int target = 8;
        // int[] nums = { 1, 0, -1, 0, -2, 2 };
        // int target = 0;
        System.out.println(fourSum(nums, target));
    }
}
