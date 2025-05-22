package Leetcode.BinarySearchTree;

public class SearchInBST_700 {
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
        public TreeNode searchBST(TreeNode root, int data) {
            if (root == null) {
                return null;
            }
            if (root.val == data) {
                return root;
            }
            if (root.val < data) {
                return searchBST(root.right, data);

            } else {

                return searchBST(root.left, data);
            }
        }
    }
}
