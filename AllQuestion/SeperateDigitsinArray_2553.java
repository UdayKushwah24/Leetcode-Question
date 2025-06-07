package Leetcode.AllQuestion;

import java.util.*;

public class SeperateDigitsinArray_2553 {

    public static int[] separateDigits(int[] nums) {

        List<Integer> ll = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            List<Integer> list = new ArrayList<>();
            while (nums[i] > 0) {
                list.add(0, nums[i] % 10);
                nums[i] /= 10;
            }
            for (int j = 0; j < list.size(); j++) {
                ll.add(list.get(j));
            }
        }
        System.out.println(ll);
        int ans[] = new int[ll.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = ll.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 13, 25, 83, 77 };
        int[] ans = separateDigits(nums);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
