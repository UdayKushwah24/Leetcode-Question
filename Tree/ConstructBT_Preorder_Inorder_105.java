package Leetcode.Tree;

public class ConstructBT_Preorder_Inorder_105 {

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
        public TreeNode buildTree(int[] preorder, int[] inorder) {
            return CreateTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
        }

        private TreeNode CreateTree(int[] preorder, int plo, int phi, int[] inorder, int ilo, int ihi) {
            
            if (ilo > ihi || plo > phi) {
                return null;
            }
            TreeNode node = new TreeNode(preorder[plo]);
            int idx = Search(inorder, ilo, ihi, preorder[plo]);
            int ne = idx - ilo;
            node.left = CreateTree(preorder, plo + 1 ,plo + ne, inorder, ilo, idx - 1);
            node.right = CreateTree(preorder,plo + ne + 1  ,phi  , inorder, idx + 1, ihi);
            return node;
        }

        private int Search(int[] inorder, int si, int ei, int item) {
            for (int i = si; i <= ei; i++) {
                if (inorder[i] == item) {
                    return i;
                }
            }
            return 0;
        }
    }

    public static void main(String[] args) {

    }
}
