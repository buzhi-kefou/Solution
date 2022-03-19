package com.soulmate.dynamic;

public class P746 {

    public int minCostClimbingStairs(int[] cost) {
        if(cost.length<2)
            return 0;
        int[] dp = new int[cost.length + 1];
        dp[0]=dp[1]=0;
        int pos=2;
        while (pos<dp.length){
            dp[pos]=Math.min(dp[pos-1]+cost[pos-1],dp[pos-2]+cost[pos-2]);
            pos++;
        }
        return dp[dp.length-1];
    }

    //dp[i]=min(dp[i−1]+cost[i−1],dp[i−2]+cost[i−2])
}
