package com.soulmate.dynamic;

public class P213 {

    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }

        if(nums.length==2){
            return Math.max(nums[0],nums[1]);
        }

        int one=nums[0],two=Math.max(nums[0],nums[1]),tmp,max;
        for(int i=0;i<nums.length-1;i++){
            tmp=two;
            two=Math.max(two,one+nums[i]);
            one=tmp;
        }
        max=two;
        one=nums[1];
        two=Math.max(nums[1],nums[2]);
        for(int i=1;i<nums.length;i++){
            tmp=two;
            two=Math.max(two,one+nums[i]);
            one=tmp;
        }
        return max>two?max:two;
    }
}
