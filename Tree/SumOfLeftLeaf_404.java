package Leetcode.Tree;

public class SumOfLeftLeaf_404 {

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
        int sum = 0;

        public int sumOfLeftLeaves(TreeNode root) {
            sum = 0;
            LeftLeaves(root, false);
            return sum;
        }

        public void LeftLeaves(TreeNode root, boolean isLeftNode) {
            if (root == null) {
                return;
            }
            if (root.left == null && root.right == null && isLeftNode == true) {
                sum = sum + root.val;
                return;
            }
            LeftLeaves(root.left, true);
            LeftLeaves(root.right, false);
        }

    }
}
