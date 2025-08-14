package Leetcode.Tree;

public class DiameterOfTree_543 {
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

    // Time Complexity : O(n^2)
   /*  class Solution {
      public int diameterOfBinaryTree(TreeNode root) {
          return diameter(root);
      }
      public int diameter(TreeNode root) {
          if (root == null) {
              return 0;
          }
              
          int ld = diameter(root.left);  // diameter of left-subtree
          int rd = diameter(root.right); // diameter of right-subtree
          int sd = height(root.left)+height(root.right)+2;  // diameter passes from root or self diameter
          return Math.max(sd, Math.max(ld, rd));
      }
      public int height(TreeNode root) {
          if (root == null) {
              return -1;      
          }
   
          int lh = height(root.left);
          int rh = height(root.right);
          return Math.max(lh, rh)+1;
      }
   } */
   
   

   // Time Complexity : O(n)
    
   class Solution {
        class DiaPair {
            int dia = 0;  // diameter of tree
            int ht = -1;  // height of tree
        }

        public int diameterOfBinaryTree(TreeNode root) {
            return diameter(root).dia;
        }
        
        private DiaPair diameter(TreeNode root) {

            if (root == null) {
                return new DiaPair();
            }

            DiaPair ldp = diameter(root.left);  // left diameter pair
            DiaPair rdp = diameter(root.right); // right diameter pair
            DiaPair sdp = new DiaPair(); // self diameter pair
            sdp.ht = Math.max(ldp.ht, rdp.ht) + 1;
            int sd = ldp.ht + rdp.ht + 2;  // self diameter
            sdp.dia = Math.max(sd, Math.max(ldp.dia, rdp.dia));
            return sdp;
        }




        
    }
}
