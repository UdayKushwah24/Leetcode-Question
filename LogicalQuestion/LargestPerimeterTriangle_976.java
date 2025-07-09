package Leetcode.LogicalQuestion;

public class LargestPerimeterTriangle_976 {

    public static int largestPerimeter(int[] nums) {
       int max = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (isValid(nums[k], nums[j], nums[i])) {
                        max = Math.max(max, nums[i] + nums[j] + nums[k]);
                    }
                }
            }
        }
        return max;
    }

    private static boolean isValid(int a, int b, int c) {
        if (a + b <= c || b + c <= a || c + a <= b) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 2 };
        System.out.println(largestPerimeter(nums));
    }
}
