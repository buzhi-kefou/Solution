package com.soulmate.solution;

import java.util.ArrayList;
import java.util.HashMap;

public class P599 {

    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0;i<list1.length;i++){
            map.put(list1[i],i);
        }

        ArrayList<String> list = new ArrayList<>();
        int min=Integer.MAX_VALUE;

        for(int i=0;i<list2.length;i++){
            if(map.containsKey(list2[i])){
                if(map.get(list2[i])+i==min){
                    list.add(list2[i]);
                }else if(map.get(list2[i])+i<min){
                    list.clear();
                    list.add(list2[i]);
                    min=map.get(list2[i])+i;
                }
            }
        }

        String[] res=new String[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;
    }
}
