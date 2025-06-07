package Leetcode.AllQuestion;

public class CalculateDigitSum_2243 {

	public static int SumDigit(String s) {
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			sum += s.charAt(i) - '0';
		}
		return sum;
	}
	public static String digitSum(String s, int k) {
		int i = 0;
		int x = k;
		// int q = k;
		String ans = "";
		while (s.length() >= k) {
			// int num = s.charAt(i) - '0';
			String count = "";
			while (i < s.length() || x > 0) {
				int num = s.charAt(i) - '0';
				count += num;
				x--;
				i++;
			}
			x = k;
			ans += SumDigit(count);
			System.out.println(ans);;
			if (i == s.length()) {
				System.out.println(ans);
				s = ans;
				// ans = "";
				i = 0;
			}
		}
		return  ans;
	}
	public static void main(String[] args) {
		String s = "11111222223";
		int k = 3;
		System.out.println(digitSum(s, k));
	}
}
