package com.soulmate.structure;

public class P141 {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        if (head == null)
            return false;

        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            head = head.next;
            if (head == fast) {
                return true;
            }
        }

        return false;
    }
}
