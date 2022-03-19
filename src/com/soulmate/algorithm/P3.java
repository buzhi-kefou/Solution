package com.soulmate.algorithm;

import java.util.HashMap;

public class P3 {

    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0, beg = 0;
        Integer ptr;
        for (int i = 0; i < chars.length; i++) {
            ptr = map.get(chars[i]);
            if (ptr != null) {
                if (max < map.size()) {
                    max = map.size();
                }
                for (int j = beg; j <= ptr; j++) {
                    map.remove(chars[j]);
                }
                beg = ptr + 1;
            }
            map.put(chars[i], i);
        }
        return map.size() > max ? map.size() : max;
    }
}
