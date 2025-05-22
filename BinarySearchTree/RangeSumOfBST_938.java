package Leetcode.BinarySearchTree;
 

public class RangeSumOfBST_938 {

    // Approach 1 :
   /*  
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
                return;
            }
            Inorder(root.left, list);
            list.add(root.val);
            Inorder(root.right, list);
        }

        public int rangeSumBST(TreeNode root, int low, int high) {

            List<Integer> list = new ArrayList<>();
            Inorder(root, list);
            int sum = 0;
            for (int i = 0; i < list.size(); i++) {
                if(low <= list.get(i) && list.get(i) <= high) {
                    sum += list.get(i);
                }
            }
            return sum;
        }
    } */



    // Approach 2 :
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
         public void RangeSum(TreeNode root, int low , int high) {
            if (root == null) {
                return;
            }
            if (low <= root.val && root.val <= high) {
                RangeSum(root.left, low, high);
                sum += root.val;
                RangeSum(root.right, low, high);
            }
            if (root.val > high) {
                RangeSum(root.left, low, high);
            }
            if (root.val < low) {
                RangeSum(root.right, low, high);
            }
         }

        public int rangeSumBST(TreeNode root, int low, int high) {

         
            sum = 0;
            RangeSum(root, low, high);
            return sum;
        }
    }
}
