package Leetcode.BInarySearch;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectTwoArray2_350 {

    public static int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> lst = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                lst.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        int n = lst.size();
        int[] ans = new int[n];
        for (int k = 0; k < ans.length; k++) {
            ans[k] = lst.get(k);
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
