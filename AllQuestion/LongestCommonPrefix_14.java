package Leetcode.AllQuestion;

public class LongestCommonPrefix_14 {

	/* public static String longestCommonPrefix(String[] strs) {
		String first = strs[0];
		String ans = "";
		for (int i = 0; i < first.length(); i++) {
			String subStr = first.substring(0, i + 1);
			boolean allMatch = true;
			for (int j = 0; j < strs.length; j++) {
				if (!strs[j].startsWith(subStr)) {
					allMatch = false;
					break;
				}
			}
			if (allMatch) {
				ans = subStr;
			} else {
				break;
			}
		}
		return ans;
	}
		
	
	*/
	





	public static String longestCommonPrefix(String[] strs) {
		String first = strs[0];
		StringBuilder ans = new StringBuilder();
		for (int i = 0; i < first.length(); i++) {
			char ch = first.charAt(i);
			boolean allMatch = true;
			for (int j = 0; j < strs.length; j++) {
				if (strs[j].length() > i && strs[j].charAt(i) != ch) {
					allMatch = false;
					break;
				}
			}
			if (allMatch) {
				ans.append(ch);
			} else {
				break;
			}
		}
		return ans.toString();
	}

	public static void main(String[] args) {
		// String[] strs = { "flower", "flow", "flight" };
		// String[] strs = { "dog", "racecar", "car"};
		// String[] strs = { "a" };
		String[] strs = {  "ab" ,"a"};
		System.out.println(longestCommonPrefix(strs));
	}
}
