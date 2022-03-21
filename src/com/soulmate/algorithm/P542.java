package com.soulmate.algorithm;

import java.util.*;

public class P542 {


    public int[][] updateMatrix(int[][] mat) {
        ArrayDeque<Integer> list = new ArrayDeque<>();
        int one = 0, step = 1;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    one++;
                    mat[i][j] = Integer.MIN_VALUE;
                } else {
                    list.add(i);
                    list.add(j);
                }
            }
        }

        ArrayDeque<Integer> temp = new ArrayDeque<>(), swap;
        while (one != 0) {
            while (!list.isEmpty()) {
                int i = list.removeFirst(), j = list.removeFirst();
                find(mat, i + 1, j, step, temp);
                find(mat, i - 1, j, step, temp);
                find(mat, i, j + 1, step, temp);
                find(mat, i, j - 1, step, temp);
            }
            one -= temp.size() / 2;
            swap = list;
            list = temp;
            temp = swap;
            step++;
        }

        return mat;
    }

    public void find(int[][] grid, int i, int j, int val, ArrayDeque<Integer> temp) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != Integer.MIN_VALUE)
            return;
        grid[i][j] = val;
        temp.addLast(i);
        temp.addLast(j);
    }
}
