package Leetcode.LogicalQuestion;

public class SmallestEvenMultiple_2413 {
    public static int smallestEvenMultiple(int n) {
        int m = n;
        while (true) {
            if (m % 2 == 0 && m % n == 0) {
                return m;
            }
            m++;
        }
    }
    public static void main(String[] args) {
        int n = 16;
        System.out.println(smallestEvenMultiple(n));
    }
}
