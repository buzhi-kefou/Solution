package com.soulmate.algorithm;

import java.util.LinkedList;
import java.util.List;

public class P46 {
    List<List<Integer>> res= new LinkedList<>();

    public List<List<Integer>> permute(int[] nums) {
        boolean[] flag=new boolean[nums.length];
        function(flag,nums,0,new LinkedList<>());
        return res;
    }

    public void function(boolean[] flag,int[] array,int len,LinkedList<Integer> list){
        if(len==array.length){
            res.add(new LinkedList<>(list));
            return;
        }
        for(int i=0;i<array.length;i++){
            if(flag[i])
                continue;
            flag[i]=true;
            list.addLast(array[i]);
            function(flag,array,len+1,list);
            list.removeLast();
            flag[i]=false;
        }
    }
}
