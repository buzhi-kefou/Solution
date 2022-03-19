package com.soulmate.leetcode.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class P1 {
    public static void main(String[] args) {
        int[] ints = {3, 2, 4};
        System.out.println(Arrays.toString(twoSum(ints, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }

        int t;
        for(int i=0;i<nums.length;i++){
            t=target-nums[i];
            if(map.containsKey(t)){
                t=map.get(t);
                if(t!=i){
                    return new int[]{i,t};
                }
            }
        }

        return null;
    }
}
