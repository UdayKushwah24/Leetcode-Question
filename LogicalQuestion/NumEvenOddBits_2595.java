package Leetcode.LogicalQuestion;

public class NumEvenOddBits_2595 {
    
    public static int[] evenOddBit(int n) {
        int odd = 0, even = 0;
        boolean flag = true;
        while (n > 0) {
            int last = n % 2;
            if (flag && last == 1) {
                even++;
            }
            if (!flag && last == 1) {
                odd++;
            }
            flag = !flag;
            n /= 2;
        }
        return new int[]{even, odd};
    }


    /* public static String binary(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int last = n % 2;
            sb.insert(0, last);
            n /= 2;
        }
        return sb.toString();
    }
    public static int[] evenOddBit(int n) {
        int odd = 0, even = 0;
        String bin = binary(n);
       for (int i = 0; i < bin.length(); i++) {
           if (i%2 == 0 && bin.charAt(i) == '1') {
               even++;
           }
           if (i%2 == 1 && bin.charAt(i) == '1') {
               odd++;
           }
       }
        return new int[] { even, odd };
    } */

    public static void main(String[] args) {
        int n = 50;
        int ans[] = evenOddBit(n);
        System.out.print(ans[0] + " " + ans[1]);
        
    }
}
