package com.soulmate.offer;

import java.util.Arrays;
import java.util.Comparator;

public class P45 {

    public static void main(String[] args) {
        System.out.println(Long.valueOf(999999999 + "" + 999999999));
    }

    int cnt = 0;

    public String minNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++, cnt = 0) {
            for (int j = 1; j < nums.length - i; j++)
                func(nums, j - 1, j);
            if (cnt == 0)
                break;
        }

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < nums.length; i++)
            builder.append(nums[i]);
        return builder.toString();
    }

    public void func(int[] nums, int l, int r) {
        if (Long.valueOf(nums[l] + "" + nums[r]) > Long.valueOf(nums[r] + "" + nums[l])) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            cnt++;
        }
    }
}
