package com.soulmate.offer;

import java.util.ArrayList;
import java.util.List;

public class P36 {

    class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    }

    public Node treeToDoublyList(Node root) {
        if (root == null)
            return null;
        if (root.left == null && root.right == null) {
            root.left = root;
            root.right = root;
            return root;
        }

        ArrayList<Node> list = new ArrayList<>();
        func(root, list);
        int size = list.size() - 1;
        for (int i = 0; i <= size; i++) {
            if (i > 0 && i < size) {
                list.get(i).right = list.get(i + 1);
                list.get(i).left = list.get(i - 1);
            } else if (i == 0) {
                list.get(0).left = list.get(size);
                list.get(i).right = list.get(i + 1);
            } else if (i == size) {
                list.get(i).left = list.get(i - 1);
                list.get(size).right = list.get(0);
            }
        }
        return list.get(0);
    }

    public void func(Node node, List<Node> list) {
        if (node.left != null)
            func(node.left, list);
        list.add(node);
        if (node.right != null)
            func(node.right, list);
    }
}
