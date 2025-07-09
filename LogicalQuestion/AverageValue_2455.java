package Leetcode.LogicalQuestion;

public class AverageValue_2455 {
    public static int averageValue(int[] nums) {
        int s = 0;
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0 && nums[i] % 3 == 0) {
                s += nums[i];
                c++;
            }
        }
        if (c == 0)
            return 0;
        return (int) (s / c);
         
    }

    public static void main(String[] args) {
        int[] nums = { 1, 3, 6, 10, 12, 15 };
        System.out.println(averageValue(nums));

    }
}
