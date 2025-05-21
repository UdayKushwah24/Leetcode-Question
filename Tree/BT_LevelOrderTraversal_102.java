package Leetcode.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BT_LevelOrderTraversal_102 {

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
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> list = new ArrayList<>();
            if (root == null) {
                return list;
            }
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                int size = queue.size();
                List<Integer> ll = new ArrayList<>();
                for (int i = 0; i < size; i++) {
                    TreeNode rv = queue.remove();
                    ll.add(rv.val);
                    if (rv.left != null) {
                        queue.add(rv.left);
                    }
                    if (rv.right != null) {
                        queue.add(rv.right);
                    }
                }
                list.add(ll);
            }
            return list;
        }
    }

   /*  public List<List<Integer>> LevelOrderTraversal() {
        Queue<Node> queue = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> ll = new ArrayList<Integer>();
            for (int i = 0; i < size; i++) {
                Node rv = queue.remove();
                ll.add(rv.val);
                if (rv.left != null) {
                    queue.add(rv.left);
                }
                if (rv.right != null) {
                    queue.add(rv.right);
                }
            }
            list.add(ll);
        }
        return list;
    } */
}
