package Leetcode.LogicalQuestion;

import java.util.ArrayList;
import java.util.List;

public class CheckIfNumAsce_2042 {
    public static boolean areNumbersAscending(String s) {
        String[] arr = s.split(" ");
        List<Integer> ll = new ArrayList<>();
        for (String st : arr) {
            if (st.matches("\\d+")) {
                ll.add(Integer.parseInt(st));
            }
        }

        System.out.println(ll);
        for (int i = 1; i < ll.size(); i++) {
            if (ll.get(i-1) >= ll.get(i)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        // String s = "1 box has 3 blue 4 red 6";
        // String s = "hello world 5 x 5";
        String s = "sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s";
        System.out.println(areNumbersAscending(s));
    }
}
