package Leetcode.LogicalQuestion;

public class FindNumbers_1295 {

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            String s = "" + nums[i];
            if (s.length() % 2 == 0) {
                count += 1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896 };
        System.out.println(findNumbers(nums));
    }
}
