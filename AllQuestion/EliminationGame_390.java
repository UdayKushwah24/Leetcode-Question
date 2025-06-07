package Leetcode.AllQuestion;

import java.util.*;

import Tree.CreateTreeUsingLevelOrder.tree;

public class EliminationGame_390 {
    /*
     * public static List<Integer> RevList(List<Integer> ll) {
     * List<Integer> list = new ArrayList<>();
     * for (int i = 0; i < ll.size(); i++) {
     * list.add(0, ll.get(i));
     * }
     * return list;
     * }
     * 
     * public static int lastRemaining(int n) {
     * List<Integer> ll = new ArrayList<>();
     * for (int i = 1; i <= n; i++) {
     * ll.add(i);
     * }
     * System.out.println(ll);
     * boolean flag = true;
     * while (ll.size() > 1) {
     * List<Integer> list = new ArrayList<>();
     * if (flag) {
     * for (int i = 1; i < ll.size(); i += 2) {
     * list.add(ll.get(i));
     * }
     * } else {
     * List<Integer> l = RevList(ll);
     * for (int i = 1; i < ll.size(); i += 2) {
     * list.add(l.get(i));
     * }
     * 
     * }
     * 
     * ll.clear();
     * 
     * if (flag) {
     * for (int i = 0; i < list.size(); i++) {
     * ll.add(list.get(i));
     * }
     * } else {
     * for (int i = 0; i < list.size(); i++) {
     * ll.addFirst(list.get(i));
     * }
     * }
     * flag = !flag;
     * System.out.println(list);
     * }
     * 
     * 
     * 
     * return ll.get(0);
     * }
     * 
     * public static void main(String[] args) {
     * int n = 9;
     * System.out.println(lastRemaining(n));
     * }
     */

    public static int lastRemaining(int n) {
        int head = 1, step = 1;
        boolean left = true;
        while (n > 1) {
            if (left || n % 2 == 1) {
                head += step;
            }
            n /= 2;
            step *= 2;
            left = !left;
        }
        return head;
    }

    public static void main(String[] args) {
        int n = 9;
        System.out.println(lastRemaining(n));
    }
}
