package Leetcode.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class SumSubsetXOR_1863 {

    public static void Subset(int[] arr,List<List<Integer>> list, List<Integer> ll, int i) {
         
        if(arr.length == i) {
            list.add(new ArrayList<>(ll));
            return;
        }
        Subset(arr,list, ll, i+1);
        ll.add(arr[i]);
        Subset(arr, list, ll, i+1);
        ll.remove(ll.size()-1);
    }
    public static void main(String[] args) {
        int[] arr = {5,1,6};
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        Subset(arr,list,ll,0);
        System.out.println(list);
        int xor = 0;
        for (int i = 0; i < list.size(); i++) {
            int c = 0;
            for (int j = 0; j < list.get(i).size(); j++) {
                c ^= list.get(i).get(j);
            }
            xor += c;
        }
        System.out.println(xor);
    }
}
