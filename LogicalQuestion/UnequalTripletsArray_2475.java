package Leetcode.LogicalQuestion;

import java.util.Arrays;

public class UnequalTripletsArray_2475 {
    public static int unequalTriplets(int[] nums) {
        Arrays.sort(nums);
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                   if ( nums[i] != nums[j] && nums[j] != nums[k]) {
                       c++;                      
                   }
                }
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int[] nums = { 4, 4, 2, 4, 3 };
        System.out.println(unequalTriplets(nums));
    }
}
