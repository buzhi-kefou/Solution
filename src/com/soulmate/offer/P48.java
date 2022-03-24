package com.soulmate.offer;

public class P48 {

    public static int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        boolean[] flag = new boolean[95];

        int prev = 0, max = 0, res = 0, ptr;
        for (int i = 0; i < chars.length; i++) {
            ptr = chars[i] - 32;
            if (flag[ptr]) {
                if (res < max)
                    res = max;
                for (int j = prev; j < i; j++) {
                    if (chars[i] == chars[j]) {
                        prev = j + 1;
                        break;
                    }
                    flag[chars[j] - 32] = false;
                    max--;
                }
            } else {
                flag[ptr] = true;
                max++;
            }
        }
        return res > max ? res : max;
    }
}
