package com.soulmate.interview;

import java.util.ArrayList;
import java.util.List;

public class P04_03 {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode[] listOfDepth(TreeNode tree) {
        if (tree == null)
            return null;
        ArrayList<ListNode> list = new ArrayList<>();
        func(tree, 1, list);
        int size = list.size() / 2;
        ListNode[] res = new ListNode[size];
        for (int i = 0; i < size; i++) {
            res[i] = list.get(i * 2);
        }
        return res;
    }

    public void func(TreeNode node, int deep, List<ListNode> list) {
        int ptr = deep * 2;
        ListNode listNode = new ListNode(node.val);
        if (list.size() < ptr) {
            list.add(listNode);
            list.add(listNode);
        } else {
            ListNode prev = list.get(--ptr);
            prev.next = listNode;
            list.remove(ptr);
            list.add(ptr, listNode);
        }
        if (node.left != null)
            func(node.left, deep + 1, list);
        if (node.right != null)
            func(node.right, deep + 1, list);
    }
}
