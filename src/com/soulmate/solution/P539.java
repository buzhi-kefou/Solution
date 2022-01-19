package com.soulmate.solution;

import java.util.ArrayList;
import java.util.List;

public class P539 {

    public static void main(String[] args){
        String input="00:00,04:00,22:00";
        String[] split=input.split(",");
        ArrayList<String> list = new ArrayList<>();

        for(String item : split){
            list.add(item);
        }

        P539 solution = new P539();
        int res=solution.findMinDifference(list);
        System.out.println(res);
    }

    public int findMinDifference(List<String> timePoints) {
        int[] time=new int[1440];
        int cnt=0;
        int begPtr=-1;
        boolean zero=false;
        for(int i=0;i<timePoints.size()&&cnt<time.length;i++,cnt++){
            String[] item=timePoints.get(i).split(":");
            int minute=Integer.parseInt(item[1]);
            int hour=Integer.parseInt(item[0]);
            int ptr=hour*60+minute;

            if(begPtr==-1||begPtr>ptr){
                begPtr=ptr;
            }

            if(time[ptr]==0){
                time[ptr]=1;
            }else{
                zero=true;
                break;
            }
        }
        if(zero){
            return 0;
        }else{
            int temp=begPtr;
            int dist=Integer.MAX_VALUE;
            for(int i=temp+1;i<1440;i++){
                if(time[i]!=0){
                    if(dist>(i-temp)){
                        dist=i-temp;
                    }
                    temp=i;
                }
            }
            temp=(1440-temp)+begPtr;
            return Math.min(dist,temp);
        }
    }

}
