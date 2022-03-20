package com.soulmate.interview;

import java.util.ArrayDeque;

public class P02_06 {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public boolean isPalindrome(ListNode head) {
        if(head==null)
            return true;

        ArrayDeque<ListNode> deque = new ArrayDeque<>();
        ListNode fast=head.next,slow=head;
        while (fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }

        if(fast==null){
            slow=slow.next;
        }

        while (slow!=null){
            deque.addFirst(slow);
            slow=slow.next;
        }

        while (!deque.isEmpty()){
            if(head.val!= deque.removeFirst().val)
                return false;
            head=head.next;
        }
        return true;
    }
}
