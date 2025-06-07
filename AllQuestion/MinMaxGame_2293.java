package Leetcode.AllQuestion;

import java.util.ArrayList;
import java.util.List;

public class MinMaxGame_2293 {
    public static int minMaxGame(int[] nums) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        System.out.println(list);
        boolean flag = true;

        while (list.size() > 1) {

            List<Integer> ll = new ArrayList<>();
            for (int i = 0; i < list.size() ; i+=2) {
                                 
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
        int[] nums = {1,3,5,2,4,8,2,2};
        System.out.println(minMaxGame(nums));

    }
}
