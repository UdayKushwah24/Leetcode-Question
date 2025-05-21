package Leetcode.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BTLevelOrder_2_107 {
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
        public List<List<Integer>> levelOrderBottom(TreeNode root) {

            Queue<TreeNode> queue = new LinkedList<>();
            List<List<Integer>> list = new ArrayList<List<Integer>>() ;
            if(root == null) {
                return list;
            }
            queue.add(root);
            while (!queue.isEmpty()) {
                List<Integer> ll = new ArrayList<Integer>();
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    TreeNode rv = queue.remove();
                    ll.add(rv.val);
                    if(rv.left != null) queue.add(rv.left);
                    if(rv.right != null) queue.add(rv.right);
                }
                list.addFirst(ll);
            }
            return list;
        }
    }
}
