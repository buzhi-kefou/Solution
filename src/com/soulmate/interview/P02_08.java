package com.soulmate.interview;

import java.util.HashSet;

public class P02_08 {

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode loop = new ListNode(2);
        ListNode last = new ListNode(4);
        loop.next=new ListNode(0);
        loop.next.next=last;
        last.next=loop;
        head.next=loop;
        System.out.println(detectCycle(head));
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static ListNode detectCycle(ListNode head) {
        if(head==null)
            return null;

        ListNode fast=head.next,slow=head;
        while (fast!=null&&fast.next!=null&&fast!=slow){
            fast=fast.next.next;
            slow=slow.next;
        }

        if(slow==fast){
            slow=slow.next;
            while (head!=slow){
                head=head.next;
                slow=slow.next;
            }
            return head;
        }

        return null;
    }
}
