package Leetcode.LogicalQuestion;

public class SignProductArray_1822 {

    public static int arraySign(int[] nums) {
        int cn = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                return 0;
            }
            if (nums[i] < 0) {
                cn++;
            }
        }
        if (cn % 2 == 1) {
            return -1;
        } else {
            return 1;
        }
    }
    public static void main(String[] args) {
        int[] arr = { -1, -2, -3, -4, 3, 2, 1 };
        System.out.println(arraySign(arr));
    }
}
