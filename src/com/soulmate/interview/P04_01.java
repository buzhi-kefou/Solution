package com.soulmate.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class P04_01 {

    public boolean findWhetherExistsPath(int n, int[][] graph, int start, int target) {
        int from;
        List<Integer> list;
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < graph.length; i++) {
            from = graph[i][0];
            if (map.containsKey(from)) {
                list = map.get(from);
            } else {
                list = new ArrayList<>();
                map.put(from, list);
            }
            list.add(graph[i][1]);
        }
        if (!map.containsKey(start))
            return false;

        boolean[] flag = new boolean[n];
        flag[start] = true;

        return func(map, map.get(start), target, flag);
    }

    public boolean func(HashMap<Integer, List<Integer>> map, List<Integer> list, int val, boolean[] flag) {
        if (list == null)
            return false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == val)
                return true;
        }
        int from;
        for (int i = 0; i < list.size(); i++) {
            from = list.get(i);
            if (flag[from])
                continue;
            flag[from] = true;
            if (func(map, map.get(from), val, flag))
                return true;
            flag[from] = false;
        }
        return false;
    }
}
