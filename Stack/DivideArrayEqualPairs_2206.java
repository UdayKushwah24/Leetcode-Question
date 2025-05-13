package Leetcode.Stack;

public class DivideArrayEqualPairs_2206 {

    public static int MaxEle(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }
        return max;
    }

    public static boolean divideArray(int[] nums) {
        int max = MaxEle(nums);
        int ans[] = new int[max+1];
        for (int i = 0; i < nums.length; i++) {
            ans[nums[i]]++;
        }

        for (int i = 0; i < ans.length; i++) {
            if(ans[i] % 2 != 0 ) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {3,2,4,2,2,2};
        System.out.println(divideArray(arr));
    }
}
