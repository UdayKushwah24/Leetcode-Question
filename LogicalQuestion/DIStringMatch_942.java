package Leetcode.LogicalQuestion;

import java.util.Stack;

public class DIStringMatch_942 {
    public static int[] ConstructSmall(String pattern) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[pattern.length()+1];
        int count = 0;
        for (int i = 0; i <= pattern.length(); i++) {
            if(i == pattern.length() || pattern.charAt(i) == 'I'){
                ans[i] = count;
                count++;
                while (!stack.isEmpty()) {
                    ans[stack.pop()] = count;
                    count++;
                }
            } else {
                stack.push(i);
            }
        }
         
        return ans;
    }
    public static void main(String[] args) {
        String pattern = "IIIDIDD";
        int[] ans = ConstructSmall(pattern);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
