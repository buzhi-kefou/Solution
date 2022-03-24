package com.soulmate.algorithm;

public class P198 {

    public int rob(int[] nums) {
        if(nums.length==1)
            return nums[0];
        int tmp, one = nums[0], two = Math.max(nums[0],nums[1]);

        for(int i=2;i<nums.length;i++){
            tmp=two;
            two=Math.max(two,one+nums[i]);
            one=tmp;
        }
        return two;
    }
}
