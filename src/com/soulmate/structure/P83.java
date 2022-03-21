package com.soulmate.structure;

public class P83 {
    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)
            return null;
        ListNode curr=head,next=head.next;
        while (next!=null){
            if(curr.val==next.val){
                next=next.next;
                curr.next=next;
            }else {
                next=next.next;
                curr=curr.next;
            }
        }
        return head;
    }
}
