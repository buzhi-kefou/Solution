package com.soulmate.offer;

public class P03 {

    public int findRepeatNumber(int[] nums) {
        int[] hash = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(hash[nums[i]]!=0){
                return nums[i];
            }
            hash[nums[i]]++;
        }
        return 0;
    }
}
