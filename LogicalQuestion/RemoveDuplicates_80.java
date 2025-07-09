package Leetcode.LogicalQuestion;

import java.util.*;

public class RemoveDuplicates_80 {
    public static int removeDuplicates(int[] nums) {
        List<Integer> ll = new ArrayList<>();
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] == nums[i]) {
                
            }
        }

    }

    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 1, 1, 2, 3, 3 };
        System.out.println(removeDuplicates(nums));
    }
}
