package Leetcode.LogicalQuestion;

public class LargestOddNum_1903 {
    /* public static String largestOddNumber(String num) {
        StringBuilder sb = new StringBuilder();
        for (int i = num.length()-1; i >= 0; i--) {
            int n = num.charAt(i) - '0';
            if (n % 2 == 1) {
                while (i >=0) {
                    sb.insert(0, num.charAt(i));
                    i--;
                }
            }
        }
        return sb.toString();
    } */

   /*  public static String largestOddNumber(String num) {
      StringBuilder sb = new StringBuilder();
      int idx = 0;
      for (int i = num.length() - 1; i >= 0; i--) {
          int n = num.charAt(i) - '0';
          if (n % 2 == 1) {
              idx = i+1;
              break;
          }
      }
      for (int i = 0; i < idx; i++) {
          sb.append(num.charAt(i));
      }
      return sb.toString();
   }
   */

   
   public static String largestOddNumber(String num) {
       for (int i = num.length() - 1; i >= 0; i--) {
           if ((num.charAt(i) - '0') % 2 == 1) {
               return num.substring(0, i + 1); 
           }
       }
       return "";  
   }
    public static void main(String[] args) {
        String num = "6789422";
        System.out.println(largestOddNumber(num));
    }
}
