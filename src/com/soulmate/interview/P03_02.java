package com.soulmate.interview;

import java.util.Stack;

public class P03_02 {

    class MinStack {

        Stack<Integer> stack;
        Stack<Integer> min;

        public MinStack() {
            min=new Stack<>();
            stack=new Stack<>();
        }

        public void push(int x) {
            stack.push(x);
            if(!min.isEmpty()&&x>=min.peek())
                min.push(min.peek());
            else
                min.push(x);
        }

        public void pop() {
            stack.pop();
            min.pop();
        }

        public int top() {
            return  stack.peek();
        }

        public int getMin() {
            return min.peek();
        }
    }
}
