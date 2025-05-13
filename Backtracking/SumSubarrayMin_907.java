package Leetcode.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class SumSubarrayMin_907 {

    public static void main(String[] args) {
        int[] arr = { 3, 1, 2, 4 };
        List<List<Integer>> subarrays = new ArrayList<>();

        for (int start = 0; start < arr.length; start++) {
            List<Integer> temp = new ArrayList<>();
            for (int end = start; end < arr.length; end++) {
                temp.add(arr[end]); // Add current element to the subarray
                subarrays.add(new ArrayList<>(temp)); // Store a copy of the subarray
            }
        }

        System.out.println(subarrays);
        int sum = 0;
        for (int i = 0; i < subarrays.size(); i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < subarrays.get(i).size(); j++) {
                min = Math.min(min, subarrays.get(i).get(j));
            }
            sum += min;
        }
        System.out.println(sum);
    }

}