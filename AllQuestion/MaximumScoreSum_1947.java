package Leetcode.AllQuestion;

import java.util.ArrayList;
import java.util.List;

public class MaximumScoreSum_1947 {

    public static int max(List<Integer> ll) {
        int ans = 0;
        for (int i = 0; i < ll.size(); i++) {
            ans = Math.max(ans, ll.get(i));
        }
        return ans;
    }
    public static int maxCompatibilitySum(int[][] students, int[][] mentors) {
        int ans = 0;

        for (int i = 0; i < students.length; i++) {
            List<Integer> ll = new ArrayList<>();
            int count = 0;
            int c = 0;
            for (int j = 0; c < students[0].length && j < students[0].length; j++) {
                if (students[i][j] == mentors[c][j]) {
                    count++;
                } 
                if(students[i][j] == mentors[j][i]) {
                    count++;
                }
                c++;
                ll.add(count);
            }

            ans += max(ll);
        }
         return ans;
    }

    

    public static void main(String[] args) {
        // int[][] students = { { 1, 1, 0 },
        //                      { 1, 0, 1 },
        //                      { 0, 0, 1 } };

        // int[][] mentors = { { 1, 0, 0 }, 
        //                     { 0, 0, 1 }, 
        //                     { 1, 1, 0 } };


        int[][] students = {{0,0},{0,0},{0,0}}, mentors = {{1,1},{1,1},{1,1}};
        System.out.println(maxCompatibilitySum(students, mentors));
    }
}
