package com.soulmate.interview;

public class P02_03 {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public void deleteNode(ListNode node) {
        while (node != null && node.next != null) {
            node.val = node.next.val;
            if (node.next.next == null)
                node.next = null;
            node = node.next;
        }
    }
}
