package com.soulmate.structure;

public class P203 {

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

    public ListNode removeElements(ListNode head, int val) {
        ListNode curr=head,prev=null;
        head=null;

        while (curr!=null){
            if(curr.val!=val){
                if(prev!=null){
                    prev.next=curr;
                }else {
                    head=curr;
                }
                prev=curr;
            }else if(prev!=null){
                prev.next=null;
            }
            curr=curr.next;
        }

        return head;
    }
}
