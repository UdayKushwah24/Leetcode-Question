package Leetcode.Tree;

import java.util.ArrayList;
import java.util.List;

public class BT_Path_257 {
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
        public List<String> binaryTreePaths(TreeNode root) {
            List<String> list = new ArrayList<>();
            binaryTreePaths(root, "", list);
            return list;
        }

        public void binaryTreePaths(TreeNode root, String s, List<String> list) {

            if (root == null) {
                return;
            }
            if (root.left == null && root.right == null) {
                s = s + root.val;
                list.add(s);
            }
            binaryTreePaths(root.left, s + root.val + "->", list);
            binaryTreePaths(root.right, s + root.val + "->", list);

        }

    }
}
