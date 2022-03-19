package com.soulmate.dynamic;

public class P198 {
    public int rob(int[] nums) {
        //dp[n]=max(dp[n-1],dp[n-2]+nums[n])
        if(nums.length==1){
            return nums[0];
        }

        int one=nums[0],two=Math.max(nums[0],nums[1]),temp;
        for(int i=2;i<nums.length;i++){
            temp=two;
            two=Math.max(two,one+nums[i]);
            one=temp;
        }
        return two;
    }
}
