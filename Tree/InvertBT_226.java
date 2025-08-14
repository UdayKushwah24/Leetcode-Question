package Leetcode.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBT_226 {
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
      /*   public TreeNode invertTree(TreeNode root) {
       
        if (root == null) {
            return null;
        }
      
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
      } */
       
        public TreeNode invertTree(TreeNode root) {

            if (root == null) {
                return null;
            }
        
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            while (!q.isEmpty()) {
                TreeNode node = q.remove();
                TreeNode temp = node.left;
                node.left = node.right;
                node.right = temp;
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }

            
            return root;
        }
    }
}
