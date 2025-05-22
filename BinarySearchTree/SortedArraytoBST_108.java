package Leetcode.BinarySearchTree;
// wrong
public class SortedArraytoBST_108 {

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
        public static TreeNode insert(TreeNode root, int data) {
            if (root == null) {
                root = new TreeNode(data);
                return root;
            }
            if (root.val > data) {
                // left subtree
                root.left = insert(root.left, data);
            } else {
                root.right = insert(root.right, data);
            }
            return root;
        }

        public TreeNode sortedArrayToBST(int[] nums) {
            TreeNode root = null;
            for (int i = 0; i < nums.length; i++) {
                root = insert(root, nums[i]);
            }
            return root;
        }
    }
}
