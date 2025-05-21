package Leetcode.Tree;

import java.util.ArrayList;
import java.util.*;

public class N_aryTreeLevelOrderTraversal_429 {

    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };

    class Solution {
        public List<List<Integer>> levelOrder(Node root) {
            List<List<Integer>> result = new ArrayList<>();
            if (root == null) {
                return result;
            }

            Queue<Node> queue = new LinkedList<>();
            queue.add(root);

            while (!queue.isEmpty()) {
                int size = queue.size();
                List<Integer> level = new ArrayList<>();

                for (int i = 0; i < size; i++) {
                    Node curr = queue.poll();
                    level.add(curr.val);

                    if (curr.children != null) {
                        queue.addAll(curr.children); // Add all children to the queue
                    }
                }

                result.add(level);
            }

            return result;
        }
    }
}
