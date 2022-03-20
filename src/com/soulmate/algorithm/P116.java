package com.soulmate.algorithm;

import java.util.ArrayDeque;

public class P116 {

    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            next = _next;
            left = _left;
            right = _right;
        }
    }

    public Node connect(Node root) {
        if (root == null)
            return null;

        ArrayDeque<Node> deque = new ArrayDeque<>();
        deque.add(root);

        Node node;
        int cnt, size = deque.size();
        while (size != 0) {
            cnt = size;
            for (int i = 0; i < cnt; i++) {
                node = deque.removeFirst();
                if(node.left!=null)
                    deque.add(node.left);
                if(node.right!=null)
                    deque.add(node.right);
                if(i<cnt-1)
                    node.next = deque.peekFirst();
            }
            size = deque.size();
        }
        return root;
    }

}
