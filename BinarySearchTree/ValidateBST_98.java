package Leetcode.BinarySearchTree;

import java.util.ArrayList;
import java.util.List;

public class ValidateBST_98 {
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
        public void Inorder(TreeNode root, List<Integer> list) {

            if (root == null) {
                return ;
            }
            Inorder(root.left, list);
            list.add(root.val);
            Inorder(root.right, list);
        }

        public boolean isValidBST(TreeNode root) {
            List<Integer> list = new ArrayList<>();
            Inorder(root, list);
            for (int i = 1; i < list.size(); i++) {
                if(list.get(i-1)>=(list.get(i))) {
                    return false;
                }
            }
            return true;
        }
    }
}
