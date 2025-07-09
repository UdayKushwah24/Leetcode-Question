package Leetcode.LogicalQuestion;

import java.util.*;

public class ClumsyFactorial_1006 {
    public static int clumsy(int n) {
        int i = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(n);
        while (n > 0) {
            --n;
            if (i % 4 == 0) {
                stack.push(stack.pop() * n);
            } else if (n > 1 && i % 4 == 1) {
                stack.push(stack.pop() / n);
            } else if (i % 4 == 2) {
                stack.push(n);
            } else {
                stack.push(-(n));
            }
            i++;
        }
        int ans = 0;
        for (int num : stack) {
            ans += num;
        }
        return ans;
    }

    /*
     * public static int clumsy(int n) {
     * int ans = n;
     * int i = 0;
     * StringBuilder sb = new StringBuilder();
     * while (n > 0) {
     * sb.append(n);
     * if (i % 4 == 0) {
     * sb.append("*");
     * } else if (n > 1 && i % 4 == 1) {
     * sb.append("/");
     * } else if (i % 4 == 2) {
     * sb.append("+");
     * } else {
     * sb.append("-");
     * }
     * n--;
     * i++;
     * }
     * return ans;
     * }
     */

    public static void main(String[] args) {
        int n = 10;
        System.out.println(clumsy(n));
    }
}
