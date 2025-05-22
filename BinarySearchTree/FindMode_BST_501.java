package Leetcode.BinarySearchTree;

import java.util.ArrayList;
import java.util.List;

public class FindMode_BST_501 {
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

        public int[] findMode(TreeNode root) {
            if(root.left == null && root.right == null) {
                int a[] = new int[1];
                a[0] = root.val;
                return a;
            }
            List<Integer> list = new ArrayList<>();
            List<Integer> ans = new ArrayList<>();

            Inorder(root, list);
            for (int i = 1; i < list.size() - 1; i++) {
                if ((list.get(i - 1) != list.get(i)) && (list.get(i) == list.get(i + 1))) {
                    ans.add(list.get(i));
                }
            }
            int arr[] = new int[ans.size()];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = ans.get(i);
            }
            return arr;
        }
    }
}
