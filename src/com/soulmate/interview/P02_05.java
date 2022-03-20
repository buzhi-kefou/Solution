package com.soulmate.interview;

public class P02_05 {

    public static void main(String[] args) {
        System.out.println(4 / 10);
        System.out.println(0 % 10);
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int val;
        ListNode head = new ListNode(0), temp = head;
        while (l1 != null && l2 != null) {
            val = l1.val + l2.val;
            if (val > 9) {
                temp.next = new ListNode(val % 10);
                if (l1.next == null) {
                    l1.next = new ListNode(val / 10);
                } else {
                    l1.next.val += val / 10;
                }
            } else {
                temp.next = new ListNode(val);
            }
            temp = temp.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            val = l1.val;
            if (val > 9) {
                temp.next = new ListNode(val % 10);
                if (l1.next == null) {
                    l1.next = new ListNode(val / 10);
                } else {
                    l1.next.val += val / 10;
                }
            } else {
                temp.next = new ListNode(val);
            }
            temp = temp.next;
            l1 = l1.next;
        }

        while (l2 != null) {
            val = l2.val;
            if (val > 9) {
                temp.next = new ListNode(val % 10);
                if (l2.next == null) {
                    l2.next = new ListNode(val / 10);
                } else {
                    l2.next.val += val / 10;
                }
            } else {
                temp.next = new ListNode(val);
            }
            temp = temp.next;
            l2 = l2.next;
        }

        return head.next;
    }
}
