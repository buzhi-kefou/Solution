package com.soulmate.offer;

public class P22 {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode node=head;
        while (k-->0){
            node=node.next;
        }
        while (node!=null){
            head=head.next;
            node=node.next;
        }
        return head;
    }
}
