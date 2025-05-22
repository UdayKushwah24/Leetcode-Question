package Leetcode.BinarySearchTree;

public class DeleteNodeinBST_450 {

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
        public TreeNode deleteNode(TreeNode root, int key) {
            return delete(root, key);
        }

        public static TreeNode findInorderSuccessor(TreeNode root) {
            while (root.left != null) {
                root = root.left;
            }
            return root;
        }

        public static TreeNode delete(TreeNode root, int data) {
            if (root == null) {
                return null;
            }
            if (root.val < data) {
                root.right = delete(root.right, data);
            } else if (root.val > data) {
                root.left = delete(root.left, data);
            } else {
                // case 1 : Leaf Node
                if (root.left == null && root.right == null) {
                    return null;
                }

                // case 2 : single child
                if (root.left == null) {
                    return root.right;
                } else if (root.right == null) {
                    return root.left;
                }

                // case 3 : both children
                TreeNode IS = findInorderSuccessor(root.right);
                root.val = IS.val;
                root.right = delete(root.right, IS.val);
            }

            return root;
        }
    }
}