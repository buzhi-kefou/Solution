package com.soulmate.dynamic;

public class P45 {

    public int jump(int[] nums) {
        int maxPtr=0,count=0;
        for(int i=0;i<nums.length&&maxPtr<nums.length-1;){
            int temp=maxPtr,ptr=i+1;
            maxPtr=i+nums[i];
            for(int j=i+1;j<=maxPtr&&j<nums.length;j++){
                if(temp<nums[j]+j){
                    temp=nums[j]+j;
                    ptr=j;
                }
            }
            count++;
            i=ptr;
        }
        return count;
    }
}
