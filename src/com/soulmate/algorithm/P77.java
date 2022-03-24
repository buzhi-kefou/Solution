package com.soulmate.algorithm;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class P77 {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=1;i<=n-k+1;i++){
            list.addLast(i);
            func(i+1,1,n,k,list);
            list.removeLast();
        }
        return res;
    }

    public void func(int val,int len,int n,int k,LinkedList<Integer> list){
        if(len==k)
            res.add(new ArrayList<>(list));

        if(val>n)
            return;
        else
            for(int i=val;i<=n;i++){
                list.addLast(i);
                func(i+1,len+1,n,k,list);
                list.removeLast();
            }
    }
}
