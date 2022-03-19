package com.soulmate.offer;

import java.util.Stack;

public class P09 {

    class CQueue {
        //private Stack<Integer> stack1;//head
        //private Stack<Integer> stack2;//tail

        int[] stack=new int[10000];
        int head,tail;

        public CQueue() {
            //stack1=new Stack<>();
            //stack2=new Stack<>();

            head=-1;
            tail=-1;
        }

        public void appendTail(int value) {
            //stack1.push(value);
            stack[++tail]=value;
        }

        public int deleteHead() {
            //if(stack2.isEmpty()){
                //while(!stack1.isEmpty()){
                    //stack2.push(stack1.pop());
                //}
            //}
            //if(stack2.isEmpty()){
                //return -1;
            //}else{
                //return stack2.pop();
            //}
            if(head+1<=tail){
                return stack[++head];
            }else {
                return -1;
            }
        }
    }
}
