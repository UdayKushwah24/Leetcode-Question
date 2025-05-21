package Leetcode.Tree;

public class BalancedBT_110 {
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
        public boolean isBalanced(TreeNode root) {
            if (root == null) {
                return true;
            }

            int hlst = HeightTree(root.left); // height left Sub-tree
            int hrst = HeightTree(root.right); // height right Sub-tree
            if (Math.abs(hlst - hrst) > 1) {
                return false;
            }
            return isBalanced(root.left) && isBalanced(root.right);
        }

        private int HeightTree(TreeNode node) {
            if (node == null) {
                return 0;
            }
            int lh = HeightTree(node.left);
            int rh = HeightTree(node.right);
            return Math.max(lh, rh) + 1;
        }
    }
}
