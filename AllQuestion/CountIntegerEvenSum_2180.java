package Leetcode.AllQuestion;

public class CountIntegerEvenSum_2180 {

    public static int countEven(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (CheckEvenSum(i)) {
                count += 1;
            }
        }
        return count;
    }

    public static boolean CheckEvenSum(int i) {
        int sum = 0;
        while (i > 0) {
            int rem = i % 10;
            sum += rem;
            i /= 10;
        }
        return sum % 2 == 0;
    }

    public static void main(String[] args) {
        int num = 30;
        System.out.println(countEven(num));
    }
}
