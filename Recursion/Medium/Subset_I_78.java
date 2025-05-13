package Leetcode.Recursion.Medium;

import java.util.ArrayList;
import java.util.List;

public class Subset_I_78 {
     public static void Subset( int[] nums,List<List<Integer>> list, List<Integer> ll, int i) {
       
        if(nums.length == i) {
            list.add(new ArrayList<>(ll));
            return;
        }
        Subset(nums, list, ll,i+1);
        ll.add(nums[i]);
        Subset(nums, list, ll,i+1);
        ll.remove(ll.size()-1);
        
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        Subset(nums,list, ll,0);
        System.out.println(list);
    } 
}
