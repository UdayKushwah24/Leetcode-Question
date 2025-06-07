package Leetcode.AllQuestion;

public class NthDigit_400 {
	public static int findNthDigit(int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= n; i++) {
			sb.append(i);
		}

		String ans = sb.toString();
		System.out.println(ans);
		int num = ans.charAt(n - 1) - '0';
		return num;
	}
	
	public static void main(String[] args) {
		int n = 11;
		System.out.println(findNthDigit(n));
	}
}
