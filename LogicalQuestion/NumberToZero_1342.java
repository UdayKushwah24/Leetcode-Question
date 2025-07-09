package Leetcode.LogicalQuestion;

public class NumberToZero_1342 {
    public static int numberOfSteps(int num) {
        int ans = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            ans += 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int num = 14;
        System.out.println(numberOfSteps(num));
    }
}
