package com.soulmate.offer;

public class P53_2 {

    public int missingNumber(int[] nums) {
        boolean[] hash = new boolean[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            hash[nums[i]] = true;
        }
        for (int i = 0; i < hash.length; i++) {
            if (!hash[i]) {
                return i;
            }
        }
        return 0;
    }
}
