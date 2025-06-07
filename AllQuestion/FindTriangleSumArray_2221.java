package Leetcode.AllQuestion;

import java.util.*;

public class FindTriangleSumArray_2221 {

    public static int triangularSum(int[] nums) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        System.out.println(list);
        while (list.size() > 1) {

            List<Integer> ll = new ArrayList<>();
            for (int i = 0; i < list.size() - 1; i++) {
                ll.add((list.get(i) + list.get(i + 1)) % 10);

            }
            System.out.println(ll);
            while (!list.isEmpty()) {
                list.removeFirst();
            }
            for (int i = 0; i < ll.size(); i++) {
                list.add(ll.get(i));
            }
        }
        return list.get(0);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(triangularSum(arr));
    }
}
