package com.soulmate.dynamic;

public class P55 {

    public boolean canJump(int[] nums) {
        int maxPtr=0;
        for(int i=0;i<nums.length;i++){
            if(maxPtr<i){
                return false;
            }
            if(maxPtr<i+nums[i]){
                maxPtr=i+nums[i];
            }
            if(maxPtr>=nums.length-1){
                return true;
            }
        }
        return maxPtr>=nums.length-1;
    }


}
