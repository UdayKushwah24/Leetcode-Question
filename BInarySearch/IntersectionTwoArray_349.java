package Leetcode.BInarySearch;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionTwoArray_349 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> lst = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j] && !lst.contains(nums1[i])) {
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
}
