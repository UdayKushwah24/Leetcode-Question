package Leetcode.Tree;

public class MinimumDepth_111 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
  
    class Solution {
        public int minDepth(TreeNode root) {
            
            if(root == null) {
                return 0;
            }

            
            // If one of the subtrees is null, we must go through the non-null one
            if (root.left == null) return minDepth(root.right) + 1;
            if (root.right == null) return minDepth(root.left) + 1;

            // If both subtrees are non-null, take the minimum
            int left = minDepth(root.left);
            int right = minDepth(root.right);
            return Math.min(left, right)+1;
        }
    }
}
