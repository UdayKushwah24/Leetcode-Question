package Leetcode.AllQuestion;

public class HappyNumber_202 {
    public static boolean isHappy(int n) {
        while (n > 9) {
            int temp = 0;
            while(n > 0) {
                int rem = n% 10;
                temp += rem*rem;
                n /= 10;
            }
            n = temp;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));
    }
}
