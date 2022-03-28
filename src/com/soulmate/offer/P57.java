package com.soulmate.offer;

import java.util.Arrays;

public class P57 {

    public static void main(String[] args) {
        int[] ints = {2, 7, 11, 15};
        int[] sum = new P57().twoSum(ints, 9);
        System.out.println(Arrays.toString(sum));
    }

    public int[] twoSum(int[] nums, int target) {
        int mid, left = 0, right = nums.length - 1;
        while (left <= right) {
            mid = (left + right) / 2;
            if (nums[mid] > target / 2) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        int l, r = right + 1;
        if (nums[right] * 2 < target) {
            l = right;
        } else {
            l = right - 1;
        }

        while (l >= 0 && r < nums.length) {
            if (nums[l] + nums[r] == target)
                return new int[]{nums[l], nums[r]};
            if (nums[l] + nums[r] < target) {
                r += 1;
            } else {
                l -= 1;
            }
        }
        return null;
    }

}
