package Leetcode.AllQuestion;

public class FaultyKeyBoard_2810 {

	/* public static String finalString(String s) {
		StringBuilder ans = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'i') {
				ans.reverse();
			} else {
				ans.append(ch);
			}
		}

		return ans.toString();
	} */

	public static String finalString(String s) {
		String ans = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'i') {
				ans = Rev(ans);
			} else {
				ans += s.charAt(i);
			}
		}
		return ans;
	}

	public static String Rev(String ques) {
		String ans = "";
		for (int i = 0; i < ques.length(); i++) {
			ans = ques.charAt(i) + ans;

		}
		return ans;
	}

	public static void main(String[] args) {
		String s = "String";
		// String s = "poiinter";
		System.out.println(finalString(s));
	}
}
