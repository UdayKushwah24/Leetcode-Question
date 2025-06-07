package Leetcode.AllQuestion;

import java.util.*;

public class RemoveDuplicates_2_80 {
    public static int removeDuplicates(int[] nums) {

        List<Integer> ll = new ArrayList<>();
        for (int i = 0; i < nums.length-2; i++) {
            if(nums[i] != nums[i+1] ){
          
                ll.add(nums[i]);
            }
        }
        ll.add(nums[nums.length-1]);
        System.out.println(ll);
        return ll.size();
    }

    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 1, 1, 2, 3, 3 };
        System.out.println(removeDuplicates(nums));
    }
}
