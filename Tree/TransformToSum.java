package Leetcode.Tree;
 
public class TransformToSum {

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
        public int transform(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int leftChild = transform(root.left);
            int rightchild = transform(root.right);
            int data = root.val;
            root.val = root.left.val + leftChild + root.right.val + rightchild;
            return data;
        }
    }
}
