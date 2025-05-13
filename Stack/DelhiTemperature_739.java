package Leetcode.Stack;

import java.util.Stack;

public class DelhiTemperature_739 {

    public static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]) {
                // ans[stack.pop()] = temperatures[i];
                int prevIndex = stack.pop();
                ans[prevIndex] = i - prevIndex; // Number of days to wait
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            ans[stack.pop()] = 0;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] temperature = {73,74,75,71,69,72,76,73};
        int[] ans = dailyTemperatures(temperature);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(temperature[i]+" -> "+ans[i]);
        }
    }
}
