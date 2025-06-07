package Leetcode.AllQuestion;

import java.util.*;

public class FindUniqueBinaryString_1980 {

	public static void Generate(List<String> ll, int n, String s) {

		if (n == 0) {
			ll.add(s);
			return;
		}

		Generate(ll, n - 1, s + "0");
		Generate(ll, n - 1, s + "1");
	}

	public static String findDifferentBinaryString(String[] nums) {
		List<String> ll = new ArrayList<>();
		Generate(ll, nums[0].length(), "");

		System.out.println(ll);

		List<String> list = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			list.add(nums[i]);
		}
		String ans = "";
		for (int i = 0; i < ll.size(); i++) {
			if (!list.contains(ll.get(i))) {
				ans = ll.get(i);
				break;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		String[] nums = { "01", "10" };
		System.out.println(findDifferentBinaryString(nums));
	}
}
