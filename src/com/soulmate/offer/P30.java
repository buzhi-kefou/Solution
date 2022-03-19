package com.soulmate.offer;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class P30 {

    class MinStack {
        //private Stack<Integer> minStack;
        //private Stack<Integer> stack;
        int[] minStack=new int[20000];
        int[] stack=new int[20000];
        int position=-1;
        public MinStack() {
            //minStack=new Stack<>();
            //stack=new Stack<>();
        }

        public void push(int x) {
            //stack.push(x);
            //if(minStack.isEmpty()){
                //minStack.push(x);
            //}else {
                //if(minStack.peek()<=x){
                    //minStack.push(minStack.peek());
                //}else {
                    //minStack.push(x);
                //}
            //}
            stack[++position]=x;
            if(position==0){
                minStack[position]=x;
            }else {
                if(minStack[position-1]>x){
                    minStack[position]=x;
                }else {
                    minStack[position]=minStack[position-1];
                }
            }
        }

        public void pop() {
            //stack.pop();
            //minStack.pop();
            position--;
        }

        public int top() {
            //return stack.peek();
            return stack[position];
        }

        public int min() {
            //return minStack.peek();
            return minStack[position];
        }
    }
}
