package Leetcode.LogicalQuestion;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz_412 {


    // approach 1
    /* public static List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String str = "";
            if (i % 3 == 0 && i % 5 == 0) {
                str += "FizzBuzz";
            } else if (i % 3 == 0) {
                str += "Fizz";
            } else if (i % 5 == 0) {
                str += "Buzz";
            } else {
                str += i;
            }
            ans.add(str);
        }
        return ans;
    } */



    // approach 2
   /*  public static List<String> fizzBuzz(int n) {
      List<String> ans = new ArrayList<>();
      for (int i = 1; i <= n; i++) {
          String str = "";
          if (i % 3 == 0) {
              str += "Fizz";
          }
          if (i % 5 == 0) {
              str += "Buzz";
          }
          if (str == "") {
              str += i;
          }
          ans.add(str);
      }
      return ans;
   } */
   
   
    // approach 3
    public static List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        int count3 = 1;
        int count5 = 1;
        for (int i = 1; i <= n; i++) {
            String str = "";
            if (count3 == 3) {
                str += "Fizz";
                count3 = 0;
            }
            if (count5 == 5) {
                str += "Buzz";
                count5 = 0;
            }
            if (str == "") {
                str += i;
            }
            ans.add(str);
            count3++;
            count5++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 16;
        System.out.println(fizzBuzz(n));
    }
}
