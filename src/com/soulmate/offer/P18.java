package com.soulmate.offer;

public class P18 {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode deleteNode(ListNode head, int val) {
        ListNode node=head,prev=null;
        while (node.val!=val){
            prev=node;
            node=node.next;
        }

        if(prev==null)
            return node.next;
        prev.next=node.next;
        return head;
    }
}
