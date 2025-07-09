package Leetcode.LogicalQuestion;

import java.util.List;

public class Trianlge_120 {
    public static int[] minElement(List<Integer> triangle) {
        int mini = Integer.MAX_VALUE;
        int n = triangle.size();
        
        for(int i = 0;i < n;i++) {
            mini = Math.min(mini,triangle.get(i));
        }
        return new int[] { mini };
    }
    public static int minimumTotal(List<List<Integer>> triangle) {
         int sum = 0;
        int x = triangle.size();
        for (int i = 0; i < x; i++) {
            // sum += minElement(triangle.get(i));
        }
        return sum;
    }
}
