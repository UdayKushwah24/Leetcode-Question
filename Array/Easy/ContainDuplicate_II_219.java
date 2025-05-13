package Leetcode.Array.Easy;

public class ContainDuplicate_II_219 {

    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {

                if(nums[i] == nums[j] && (j-i) <= k ) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3};
        int k = 2;
        System.out.println(containsNearbyAlmostDuplicate(nums, k));
    }
}
