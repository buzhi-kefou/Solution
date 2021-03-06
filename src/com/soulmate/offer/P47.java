package com.soulmate.offer;

public class P47 {

    public int maxValue(int[][] grid) {

        //dp[i][j]=max(dp[i-1][j],dp[i][j-1])+val;

        int[][] dp = new int[grid.length][grid[0].length];
        dp[0][0] = grid[0][0];

        int ptr = 0;
        while (++ptr < grid[0].length) {
            dp[0][ptr] = grid[0][ptr];
            dp[0][ptr] += dp[0][ptr - 1];
        }

        ptr = 0;
        while (++ptr < grid.length) {
            dp[ptr][0] = grid[ptr][0];
            dp[ptr][0] += dp[ptr - 1][0];
        }

        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[0].length; j++) {
                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1])+grid[i][j];
            }
        }

        return dp[grid.length - 1][grid[0].length - 1];
    }
}
