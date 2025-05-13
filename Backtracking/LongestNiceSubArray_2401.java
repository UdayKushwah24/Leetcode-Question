package Leetcode.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class LongestNiceSubArray_2401 {

    
   /*  public static void main(String[] args) {
        int[] arr = { 1, 3, 8, 48, 10 };
        List<List<Integer>> list = new ArrayList<>();
         for (int i = 0; i < arr.length; i++) {
            List<Integer> lst = new ArrayList<>();
            for (int j = i; j < arr.length; j++) {
                lst.add(arr[j]);
                list.add(new ArrayList<>(lst));
            }
        }
        // System.out.println(list);
        int ans = 0;
        for (int i = 0; i < list.size(); i++) {
            int result = list.get(i).get(0);
            for (int j = 1; j < list.get(i).size(); j++) {
                result &= list.get(i).get(j);
            }
            if(result == 0) {
                System.out.println(list.get(i));
                ans = Math.max(ans,list.get(i).size());
            }
        }
        System.out.println( ans);
    } */
   /*  public static void main(String[] args) {
        int[] nums = {1, 3, 8, 48, 10}; // Given array

        // Nested loop to perform AND operation between every pair
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int andResult = nums[i] & nums[j]; // Bitwise AND
                System.out.println(nums[i] + " & " + nums[j] + " = " + andResult);
            }
        }
    } */


    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 48, 10};
        int ans = 0;

        // Generating all subarrays
        for (int i = 0; i < arr.length; i++) {
            int result = arr[i];  // Initialize AND with the first element
            
            for (int j = i; j < arr.length; j++) {
                result &= arr[j];  // Perform bitwise AND
                
                if (result == 0) {  // Check for "Nice" subarray
                    ans = Math.max(ans, j - i + 1); // Update max length
                    System.out.println("Nice Subarray: " + subArray(arr, i, j));
                }
            }
        }
        System.out.println("Longest Nice Subarray Length: " + ans);
    }

    // Helper function to print subarrays
    private static List<Integer> subArray(int[] arr, int start, int end) {
        List<Integer> sub = new ArrayList<>();
        for (int k = start; k <= end; k++) {
            sub.add(arr[k]);
        }
        return sub;
    }
}
