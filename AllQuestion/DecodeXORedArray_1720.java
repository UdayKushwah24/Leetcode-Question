package Leetcode.AllQuestion;

public class DecodeXORedArray_1720 {

	public static int[] decode(int[] encoded, int first) {
		int ans[] = new int[encoded.length + 1];
		ans[0] = first;
		for (int i = 1; i <= encoded.length; i++) {
			ans[i] = encoded[i - 1] ^ ans[i - 1];
		}
		return ans;
	}
	public static void main(String[] args) {
		// int[] encoded = {1,2,3}; int first = 1;
		int[] encoded = { 6, 2, 7, 3}; int first = 4;
		int ans[] = decode(encoded, first);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
	}
}
