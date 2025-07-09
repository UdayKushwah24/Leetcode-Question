package Leetcode.LogicalQuestion;

import java.util.*;
import java.util.HashSet;
import java.util.List;

public class Sum3_15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Set<String> seen = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> ll = new ArrayList<>();
                        int sum = nums[i] + nums[j] + nums[k];
                        int min = Math.min(nums[i], Math.min(nums[j], nums[k]));
                        int max = Math.max(nums[i], Math.max(nums[j], nums[k]));
                        int middle = sum - min - max;

                        ll.add(min);
                        ll.add(middle);
                        ll.add(max);
                        String key = ll.toString();
                        if (!seen.contains(key)) {
                            seen.add(key);
                            ans.add(ll);
                        }
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {

    }

}
