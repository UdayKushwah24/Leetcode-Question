package Leetcode.AllQuestion;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle_II_119 {
    public static List<Integer> getRow(int rowIndex) {

          List<Integer> ll = new ArrayList<>();
        int ncr = 1;
        ll.add(ncr);
        for (int i = 0; i < rowIndex; i++) {
            int ncrPlus1 = (int)((long)ncr*( rowIndex - i)/(1+i));
            ll.add(ncrPlus1);
            ncr = ncrPlus1;
        }

        return ll;
    }

    public static void main(String[] args) {
        int row = 3;
        System.out.println(getRow(row));
    }
}
