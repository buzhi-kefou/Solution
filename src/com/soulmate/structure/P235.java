package com.soulmate.structure;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Stack;

public class P235 {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayDeque<TreeNode> deque1 = new ArrayDeque<>();
        ArrayDeque<TreeNode> deque2 = new ArrayDeque<>();
        func(root, p, deque1);
        func(root, q, deque2);
        while (deque1.peekFirst() == deque2.peekFirst()) {
            p = deque1.removeFirst();
            deque2.removeFirst();
        }
        return p;
    }

    public void func(TreeNode node, TreeNode find, ArrayDeque<TreeNode> deque) {
        deque.addLast(node);
        if (node.val == find.val)
            return;
        if (node.val > find.val)
            func(node.left, find, deque);
        else
            func(node.right, find, deque);
    }
}
