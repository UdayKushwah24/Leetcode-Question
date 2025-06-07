package Leetcode.AllQuestion;

import java.util.ArrayList;
import java.util.List;

public class NextGreaterElement1_496 {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        List<Integer> ll = new ArrayList<>();
        int ans[] = new int[nums1.length];
        // int c = 0; 
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    if ( j == nums2.length-1) {
                        ans[i] = -1;
                    } else {
                        ans[i] = nums2[j + 1];
                    }
                } else {
                    ans[i] = -1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = { 4, 1, 2 }, nums2 = { 1, 3, 4, 2 };
        int ans[] = nextGreaterElement(nums1, nums2);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
