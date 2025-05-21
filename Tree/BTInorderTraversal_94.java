package Leetcode.Tree;

import java.util.ArrayList;
import java.util.List;

public class BTInorderTraversal_94 {
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
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> ll = new ArrayList<Integer>();
            inordertraversal(root, ll);
            return ll;
        }

        public void inordertraversal(TreeNode root, List<Integer> ll) {
            if(root == null) {
                return;
            }
            inordertraversal(root.left, ll);
            ll.add(root.val);
            inordertraversal(root.right, ll);

        }
    }
}
