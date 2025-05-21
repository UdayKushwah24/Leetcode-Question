package Leetcode.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LargestValueTreeRow_515 {
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
        public List<Integer> largestValues(TreeNode root) {
            List<Integer> list = new ArrayList<>();
            Queue<TreeNode> queue = new LinkedList<>();
            if (root == null) {
                return list;
            }
            queue.add(root);
            while (!queue.isEmpty()) {
                int max = Integer.MIN_VALUE;
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    TreeNode rv = queue.remove();
                    max = Math.max(max, rv.val);
                    if (rv.left != null) {
                        queue.add(rv.left);
                    } 
                    if (rv.right != null) {
                        queue.add(rv.right);
                    }     
                }
                list.add(max);
            }
            return list;
        }
    }
}
