package Leetcode.AllQuestion;

public class HammingDistance_477 {

	public static int hammingDistance(int x, int y) {
		int xor = x ^ y; // XOR will have 1s where bits differ
		int count = 0;
		while (xor != 0) {
			count += xor & 1; // check if last bit is 1
			xor >>= 1; // right shift
		}
		return count;
	}	

	public static int totalHammingDistance(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			int n1 = nums[i];
			for (int j = i + 1; j < nums.length; j++) {
				int n2 = nums[j];
				sum += hammingDistance(n1, n2);
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		int[] nums = { 4, 14, 2 };
		System.out.println(totalHammingDistance(nums));
	}
}
