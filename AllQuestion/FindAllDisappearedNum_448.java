package Leetcode.AllQuestion;

import java.util.ArrayList;
import java.util.List;

public class FindAllDisappearedNum_448 {
	public static List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> lst = new ArrayList<>();
		List<Integer> arrList = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			arrList.add(nums[i]);
		}
		System.out.println(arrList);
		for (int i = 0; i < nums.length; i++) {
			if (!arrList.contains(i + 1)) {
				lst.add(i + 1);
			}
		}

		return lst;
	}

	public static void main(String[] args) {
		int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
		System.out.println(findDisappearedNumbers(nums));
	}
}
