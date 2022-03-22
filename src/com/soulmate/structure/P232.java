package com.soulmate.structure;

import java.util.Stack;

public class P232 {


    class MyQueue {

        Stack<Integer> head,tail;

        public MyQueue() {
            head=new Stack<Integer>();
            tail=new Stack<Integer>();
        }

        public void push(int x) {
            head.push(x);
        }

        public int pop() {
            if(tail.isEmpty()){
                while (!head.isEmpty()){
                    tail.push(head.pop());
                }
            }
            return tail.pop();
        }

        public int peek() {
            if(tail.isEmpty()){
                while (!head.isEmpty()){
                    tail.push(head.pop());
                }
            }

            return tail.peek();
        }

        public boolean empty() {
            if(head.isEmpty()&&tail.isEmpty())
                return true;
            return false;
        }
    }
}
