package com.soulmate.structure;

import java.util.ArrayList;
import java.util.List;

public class P118 {

    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> rest = new ArrayList<>(numRows);
        List<Integer> row = new ArrayList<>(1);
        rest.add(row);
        row.add(1);

        List<Integer> prev;
        for(int i=1;i<numRows;i++){
            row = new ArrayList<>(i+1);
            row.add(1);
            for(int j=1;j<i;j++){
                prev = rest.get(i - 1);
                row.add(prev.get(j-1)+prev.get(j));
            }
            row.add(1);
            rest.add(row);
        }
        return rest;
    }
}
