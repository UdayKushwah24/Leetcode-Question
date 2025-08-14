package Leetcode.Tree;

import java.util.*;

public class DeepestLeavesSum_1302 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {

        /*  
        public int deepestLeavesSum(TreeNode root) {
            List<List<Integer>> list = levelOrderBottom(root);
            List<Integer> ll = list.get(list.size() - 1);
            int sum = 0;
            for (int i = 0; i < ll.size(); i++) {
                sum += ll.get(i);
            }
            return sum;
        }
        
        public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
            Queue<TreeNode> queue = new LinkedList<>();
            List<List<Integer>> list = new ArrayList<List<Integer>>();
            if (root == null) {
                return list;
            }
            queue.add(root);
            while (!queue.isEmpty()) {
                List<Integer> ll = new ArrayList<Integer>();
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    TreeNode rv = queue.remove();
                    ll.add(rv.val);
                    if (rv.left != null)
                        queue.add(rv.left);
                    if (rv.right != null)
                        queue.add(rv.right);
                }
                list.add(ll);
            }
            return list;
        } */








        //======================================
        
        public int height(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int left = height(root.left);
            int right = height(root.right);
            return Math.max(left, right)+1;
        }
        int ans;
        public void lastLevel(TreeNode root, int cl , int k ) {
            if (root == null) {
                return;
            }
            if (cl == k) {
                ans += root.val;
            }
            lastLevel(root.left, cl+1, k);
            lastLevel(root.right, cl+1, k);

        }
        public int deepestLeavesSum(TreeNode root) {
            int k = height(root);
            ans = 0;
            lastLevel(root, 0, k);
            return ans;
        }
    }
}
