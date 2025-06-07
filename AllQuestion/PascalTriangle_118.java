package Leetcode.AllQuestion;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle_118 {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> ll = new ArrayList<>();
            int ncr = 1;
            ll.add(ncr);
            for (int j = 0; j < i; j++) {
                int ncrPlus1 = (int) ( ncr * (i - j) / (j + 1));
                ll.add(ncrPlus1);
                ncr = ncrPlus1;
            }
            ans.add(new ArrayList<>(ll));
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> ans = generate(n);
        System.out.println(ans);
    }
}
