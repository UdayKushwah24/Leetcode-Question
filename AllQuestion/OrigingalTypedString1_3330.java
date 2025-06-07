package Leetcode.AllQuestion;

public class OrigingalTypedString1_3330 {
	public static int possibleStringCount(String word) {
		int count = 0;
		int[] arr = new int[26];
		for (int i = 0; i < word.length(); i++) {
			arr[word.charAt(i) - 'a']++;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 1) {
				count += arr[i];
			}
		}

		return count;
	}

	public static void main(String[] args) {
		String word = "abbcccc";
		// String word = "abcd";
		System.out.println(possibleStringCount(word));
	}
}
