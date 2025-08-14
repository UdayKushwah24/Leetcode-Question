package Leetcode.Tree;

import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class isCompleteTree {

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
        public boolean isCompleteTree(TreeNode root) {
            if (root == null) {
                return false;
            }
            if (root.right == null && root.left == null) {
                return false;
            }
            if (root.right == null && root.left != null) {
                return true;
            }
            boolean left = isCompleteTree(root.left);
            boolean right = isCompleteTree(root.right);
            return left && right;
        }

        public int height(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int left = height(root.left);
            int right = height(root.right);
            return Math.max(left, right) + 1;
        }

        public boolean LevelOrder(TreeNode node) {
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(node);
            
            int countNode = 1;

            while (!queue.isEmpty()) {
                int s = queue.size();
                
                List<Integer> ll = new ArrayList<>();
                for (int i = 0; i < s; i++) {
                    TreeNode rv = queue.remove();
                    ll.add(rv.val);

                    if (rv.left != null) {
                        queue.add(rv.left);
                    }
                    if (rv.right != null) {
                        queue.add(rv.right);
                    }

                }

                if (ll.size() != countNode) {
                    return false;
                }
                countNode *= 2;
            }
            return true;
        }
    }
}
