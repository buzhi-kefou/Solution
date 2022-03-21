package com.soulmate.algorithm;

import java.util.ArrayList;
import java.util.List;

public class P994 {
    public static void main(String[] args) {
        int[][] mat = new int[3][3];
        mat[0]=new int[]{2,1,1};
        mat[1]=new int[]{1,1,0};
        mat[2]=new int[]{0,1,1};

        System.out.println(new P994().orangesRotting(mat));
    }

    public int orangesRotting(int[][] grid) {
        ArrayList<Integer> list = new ArrayList<>();
        int max=grid.length*grid[0].length;
        int zero=0,two=0,day=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                switch (grid[i][j]){
                    case 0:
                        zero++;
                        break;
                    case 2:
                        list.add(i);
                        list.add(j);
                        two++;
                        break;
                }
            }
        }
        int old=two;
        while (zero+two!=max){
            ArrayList<Integer> temp = new ArrayList<>();
            while (!list.isEmpty()){
                int i = list.remove(0), j = list.remove(0);
                two = expand(grid, i + 1, j, two, temp);
                two = expand(grid, i - 1, j, two, temp);
                two = expand(grid, i, j + 1, two, temp);
                two = expand(grid, i, j - 1, two, temp);
            }
            if(old==two)
                return -1;
             else
                day++;
            list=temp;
            old=two;
        }
        return day;
    }

    public int expand(int[][] grid, int i, int j, int old, List<Integer> list){
        if(i<0||i>=grid.length||j<0||j>=grid[0].length)
            return old;
        if(grid[i][j]==1){
            grid[i][j]=2;
            list.add(i);
            list.add(j);
            old++;
        }
        return old;
    }
}
