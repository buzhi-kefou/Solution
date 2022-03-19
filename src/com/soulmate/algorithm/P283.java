package com.soulmate.algorithm;

public class P283 {
    public void moveZeroes(int[] nums) {
        int ptr1=0,ptr2=-1;
        while (ptr1<nums.length){
            if(nums[ptr1]==0){
                if(ptr2>ptr1){
                    ptr2++;
                }else {
                    ptr2=ptr1+1;
                }
                while (ptr2<nums.length&&nums[ptr2]==0){
                    ptr2++;
                }
                if(ptr2!=nums.length){
                    swap(nums,ptr1,ptr2);
                }else {
                    break;
                }
            }
            ptr1++;
        }
    }

    public void swap(int[] array,int a,int b){
        int temp=array[a];
        array[a]=array[b];
        array[b]=temp;
    }
}
