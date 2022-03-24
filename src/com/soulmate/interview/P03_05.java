package com.soulmate.interview;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class P03_05 {

    class SortedStack {

        private Deque<Integer> stack, temp;

        public SortedStack() {
            stack = new LinkedList<>();
            temp = new LinkedList<>();
        }

        public void push(int val) {
            if (isEmpty())
                stack.push(val);
            else {
                while (!stack.isEmpty() && val > stack.peek()) {
                    temp.push(stack.pop());
                }
                stack.push(val);
                while (!temp.isEmpty()) {
                    stack.push(temp.pop());
                }
            }
        }

        public void pop() {
            if (stack.isEmpty())
                return;
            stack.pop();
        }

        public int peek() {
            if (stack.isEmpty())
                return -1;
            return stack.peek();
        }

        public boolean isEmpty() {
            return stack.isEmpty();
        }
    }
}
