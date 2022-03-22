package com.soulmate.interview;

public class P03_01 {

    class TripleInOne {

        int[] stack;
        int ptr0,ptr1,ptr2,len0,len1,len2;

        public TripleInOne(int stackSize) {
            len2=3*stackSize;
            len1=2*stackSize;
            len0=1*stackSize;

            stack=new int[len2];
            ptr2=len1;
            ptr1=len0;
            ptr0=0;
        }

        public void push(int stackNum, int value) {
            if(stackNum==0&&ptr0<len0){
                stack[ptr0++]=value;
                return;
            }
            if(stackNum==1&&ptr1<len1){
                stack[ptr1++]=value;
                return;
            }
            if(stackNum==2&&ptr2<len2){
                stack[ptr2++]=value;
                return;
            }
        }

        public int pop(int stackNum) {
            if(stackNum==0&&ptr0>0){
                return stack[--ptr0];
            }
            if(stackNum==1&&ptr1>len0){
                return stack[--ptr1];
            }
            if(stackNum==2&&ptr2>len1){
                return stack[--ptr2];
            }
            return -1;
        }

        public int peek(int stackNum) {
            if(stackNum==0&&ptr0>0){
                return stack[ptr0-1];
            }
            if(stackNum==1&&ptr1>len0){
                return stack[ptr1-1];
            }
            if(stackNum==2&&ptr2>len1){
                return stack[ptr2-1];
            }
            return -1;
        }

        public boolean isEmpty(int stackNum) {
            if(stackNum==0){
                return ptr0==0;
            }
            if(stackNum==1){
                return ptr1==len0;
            }
            if(stackNum==2){
                return ptr2==len1;
            }
            return false;
        }
    }
}
