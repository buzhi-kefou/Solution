package com.soulmate.offer;

public class P52 {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1 = 0, len2 = 0;
        ListNode n1 = headA, n2 = headB;
        while (n1 != null) {
            n1 = n1.next;
            len1++;
        }
        while (n2 != null) {
            n2 = n2.next;
            len2++;
        }

        len1 -= len2;
        if (len1 > 0) {
            while (len1-- != 0) {
                headA = headA.next;
            }
        } else {
            while (len1++ != 0) {
                headB = headB.next;
            }
        }

        while (headA != null) {
            if (headA == headB)
                return headA;
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}
