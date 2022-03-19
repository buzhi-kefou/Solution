package com.soulmate.structure;

public class P121 {

    public int maxProfit(int[] prices) {
        int max=0,prev=0;
        for(int i=prices.length-1;i>=0;i--){
            if(prev<=prices[i]){
                prev=prices[i];
            }else {
                max=Math.max(max,prev-prices[i]);
            }
        }
        return max;
    }
}