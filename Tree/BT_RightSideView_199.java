package Leetcode.Tree;

import java.util.ArrayList;
import java.util.List;

public class BT_RightSideView_199 {
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
        public List<Integer> rightSideView(TreeNode root) {
            List<Integer> ll = new ArrayList<>();
            rightSide(root, 1, ll);
            return ll;
        }

        int maxdepth = 0;

        public void rightSide(TreeNode root, int currLevel, List<Integer> ll) {
            if (root == null) {
                return;
            }
            if (maxdepth < currLevel) {
                ll.add(root.val);
                // System.out.print(root.val + " ");
                maxdepth = currLevel;
            }
            rightSide(root.right, currLevel + 1, ll);
            rightSide(root.left, currLevel + 1, ll);
        }
    }
}
