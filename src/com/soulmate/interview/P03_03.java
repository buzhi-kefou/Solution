package com.soulmate.interview;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Stack;

public class P03_03 {

    class StackOfPlates {

        ArrayList<Stack<Integer>> stacks;
        int cap, cnt, idx;

        public StackOfPlates(int cap) {
            stacks = new ArrayList<Stack<Integer>>();
            this.cap = cap;
            this.idx = -1;
            this.cnt = 0;
        }

        public void push(int val) {
            if (cap == 0) {
                return;
            }
            cnt++;
            if (stacks.isEmpty() || stacks.get(idx).size() == cap) {
                stacks.add(new Stack<>());
                stacks.get(++idx).push(val);
            } else {
                stacks.get(idx).push(val);
            }
        }

        public int pop() {
            if (cap == 0 || cnt <= 0)
                return -1;
            cnt--;
            if (stacks.get(idx).size() != 1)
                return stacks.get(idx).pop();
            else
                return stacks.remove(idx--).pop();
        }

        public int popAt(int index) {
            if (cap == 0 || index >= stacks.size())
                return -1;
            cnt--;
            Stack<Integer> stack = stacks.get(index);
            if (stack.size() == 1 && idx-- >= 0)
                stacks.remove(index);
            return stack.pop();
        }
    }
}
