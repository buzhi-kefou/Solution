package com.soulmate.offer;

public class P61 {

    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5};
        System.out.println(new P61().isStraight(ints));
    }

    public boolean isStraight(int[] nums) {
        boolean[] flag = new boolean[5];
        return findMin(flag, nums, 0, 0);
    }

    public boolean findMin(boolean[] flag, int[] arr, int prev, int cnt) {
        if (cnt == 5)
            return true;
        int min = -1, zero = -1;
        for (int i = 0; i < arr.length; i++) {
            if (!flag[i]) {
                if (arr[i] == 0)
                    zero = i;
                else if (min == -1 || arr[min] > arr[i])
                    min = i;
            }
        }
        if (min != -1 && (prev == 0 || arr[min] - prev == 1)) {
            flag[min] = true;
            return findMin(flag, arr, arr[min], cnt + 1);
        } else if (zero != -1) {
            flag[zero] = true;
            return findMin(flag, arr, prev + 1, cnt + 1);
        } else {
            return false;
        }
    }
}
