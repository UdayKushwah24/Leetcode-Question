package Leetcode.Tree;


////////////////wrong



public class SumRootToLeafBinaryNum_1022 {
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
        public int sumRootToLeaf(TreeNode root) {
            return sumRootToLeaf(root.left, 0);
        }

        public int sumRootToLeaf(TreeNode root, int sum) {
            if (root == null) {
                return 0;
            }
            if (root.left == null && root.right == null) {
                sum = sum * 10 + root.val;
                return sum;
            }
            int left = sumRootToLeaf(root.left, sum * 10 + root.val);
            int right = sumRootToLeaf(root.right, sum * 10 + root.val);
            return BinToDeci(left) + BinToDeci(right);
        }

        private int BinToDeci(int n) {
            int sum = 0;
            int count = 0;
            while (n != 0) {
                int rem = n % 10;
                sum = sum + rem*(int)Math.pow(2,count);
                count++;
                n = n / 10;
            }
            return sum;
        }
    }
}
