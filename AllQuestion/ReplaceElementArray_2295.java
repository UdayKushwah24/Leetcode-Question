package Leetcode.AllQuestion;

public class ReplaceElementArray_2295 {
	public static int[] arrayChange(int[] nums, int[][] operations) {
		for (int i = 0; i < operations.length; i++) {

			for (int j = 0; j < nums.length; j++) {
				if (nums[j] == operations[i][0]) {
					nums[j] = operations[i][1];
				}
			}
		}
		return nums;
	}
	public static void main(String[] args) {
		int[] nums = {1,2,4,6};
		int[][] operations = { { 1, 3 }, { 4, 7 }, { 6, 1 } };
		int[] ans = arrayChange(nums, operations);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
	}
}
