package com.soulmate.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P1 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] split = bufferedReader.readLine().split(",");
        int[] arr = new int[split.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }
        P1 solution = new P1();
        arr = solution.twoSum(arr, Integer.parseInt(bufferedReader.readLine()));
        System.out.println(Arrays.toString(arr));
    }

    public int[] twoSum(int[] nums, int target) {
        int[] ptrs = new int[nums.length];
        for(int i=0;i<ptrs.length;i++){
            ptrs[i]=i;
        }
        shellSort(nums,ptrs);
        for(int i=0;i<nums.length;i++){
            int temp = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (temp + nums[j] == target) {
                    return new int[]{ptrs[i], ptrs[j]};
                } else if (temp + nums[j] > target) {
                    break;
                }
            }
        }
        return null;
    }

    public void shellSort(int[] arr,int[] location){
        int step = arr.length / 2;
        while (step > 0) {
            int beg = step;
            while (beg < arr.length) {
                int temp = arr[beg];
                int loc = location[beg];
                int ptr = beg;
                while (ptr >= step && arr[ptr - step] > temp) {
                    arr[ptr] = arr[ptr - step];
                    location[ptr] = location[ptr - step];
                    ptr -= step;
                }
                arr[ptr] = temp;
                location[ptr] = loc;
                beg++;
            }
            step /= 2;
        }
    }
}
