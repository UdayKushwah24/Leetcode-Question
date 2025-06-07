package Leetcode.AllQuestion;

import java.util.*;

public class ValidParenthesisPath_2267 {

   /*  public static boolean CheckParenthesis(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.add(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                if (stack.peek() == '(' && ch == ')') {
                    stack.pop();
                } else if (stack.peek() == '{' && ch == '}') {
                    stack.pop();
                } else if (stack.peek() == '[' && ch == ']') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        if (stack.isEmpty()) {

            return true;
        } else {
            return false;
        }
    }

    public static void path(char[][] grid, List<String> ll, int cr, int cc, String ans) {
        if (cr >= grid.length || cc >= grid[0].length) {
            return;
        }
        if (cr == grid.length-1  && cc == grid[0].length-1 ) {
            ans += grid[grid.length-1][grid[0].length-1];
            ll.add(ans);
            // System.out.println(ans);
            return;
        }
        path(grid, ll, cr, cc+1, ans+grid[cr][cc]);
        path(grid, ll, cr+1, cc, ans+grid[cr][cc]);
    }

    public static void main(String[] args) {
        // System.out.println(CheckParenthesis("((())()"));
        char[][] grid = { { '(', '(', '(' },
                          { ')', '(', ')' },
                          { '(', '(', ')' },
                          { '(', '(', ')' } };
        List<String> ll = new ArrayList<>();
        path(grid, ll, 0, 0, "");
        System.out.println(ll);
        for (int i = 0; i < ll.size(); i++) {
            if(CheckParenthesis(ll.get(i))){
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    } */


 

    public static boolean CheckParenthesis(char[][] grid,  int cr, int cc, int OpenCount) {
        if (cr >= grid.length || cc >= grid[0].length) {
            return false;
        }
        if (grid[cr][cc] == '(') {
            OpenCount++;
        } else {
            OpenCount--;
        }

        if (cr == grid.length-1 && cc == grid[0].length-1) {
            return OpenCount == 0;
        }

        if (OpenCount < 0) {
            return false;
        }
        boolean down = CheckParenthesis(grid, cr+1, cc, OpenCount);
        boolean right = CheckParenthesis(grid, cr, cc+1, OpenCount);
        return down || right;
    }

    public static void main(String[] args) {
        // System.out.println(CheckParenthesis("((())()"));
        char[][] grid = { { '(', '(', '(' },
                          { ')', '(', ')' },
                          { '(', '(', ')' },
                          { '(', '(', ')' } };
        System.out.println(CheckParenthesis(grid, 0, 0, 0));
    }
}
