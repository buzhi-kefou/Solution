package com.soulmate.offer;

public class P21 {

    public int[] exchange(int[] nums) {
        int end=nums.length,tmp;

        for(int i=0;i<nums.length;i++){
            if((nums[i]&1)==1)
                continue;
            while (--end>i){
                if((nums[end]&1)==1){
                    tmp=nums[end];
                    nums[end]=nums[i];
                    nums[i]=tmp;
                    break;
                }
            }
            if(end<=i)
                break;
        }
        return nums;
    }

}
