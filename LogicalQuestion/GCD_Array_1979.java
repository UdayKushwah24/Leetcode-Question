package Leetcode.LogicalQuestion;

import java.util.Arrays;

public class GCD_Array_1979 {
    public static int findGCD(int[] nums) {
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length - 1];
        int gcd = 0;
        for (int i = 1; i <= Math.max(max, min); i++) {
            if (min % i == 0 && max % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 5, 6, 9, 10 };
        System.out.println(findGCD(nums));
    }
}
