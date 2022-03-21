package com.soulmate.offer;

public class P63 {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }

    public static int maxProfit(int[] prices) {
        if (prices.length==0||prices.length==1)
            return 0;

        int max=0,sum=0;
        for(int i=0;i<prices.length-1;i++){
            sum+=prices[i+1]-prices[i];
            if(max<sum)
                max=sum;
            if(sum<0)
                sum=0;
        }

        return max;
    }
}
