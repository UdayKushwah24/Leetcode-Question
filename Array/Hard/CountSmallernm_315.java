<<<<<<< HEAD
package Leetcode.Array.Hard;

import java.util.ArrayList;
import java.util.List;

public class CountSmallernm_315 {

    public static List<Integer> countSmaller(int[] nums) {
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            int count = 0;
            for (int j = i+1; j < nums.length; j++) {
                if(nums[j] < curr) {
                    count++;
                }
            }
            lst.add(i,count);
        }
        return lst;
    }
    public static void main(String[] args) {
        int[] arr = {5,2,6,1};
        System.out.println(countSmaller(arr));
    }
}
=======
package Leetcode.Array.Hard;

import java.util.ArrayList;
import java.util.List;

public class CountSmallernm_315 {

    public static List<Integer> countSmaller(int[] nums) {
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            int count = 0;
            for (int j = i+1; j < nums.length; j++) {
                if(nums[j] < curr) {
                    count++;
                }
            }
            lst.add(i,count);
        }
        return lst;
    }
    public static void main(String[] args) {
        int[] arr = {5,2,6,1};
        System.out.println(countSmaller(arr));
    }
}
>>>>>>> 918d1b89065d474af45ae17753718f3bfe1f7407
