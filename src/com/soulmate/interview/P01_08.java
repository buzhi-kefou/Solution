package com.soulmate.interview;

import java.util.ArrayList;

public class P01_08 {

    public void setZeroes(int[][] matrix) {
        int row=matrix.length,col=matrix[0].length;

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    list.add(i);
                    list.add(j);
                }
            }
        }

        while (!list.isEmpty()){
            int a=list.remove(0);
            int b=list.remove(0);
            for(int i=0;i<col;i++){
                matrix[a][i]=0;
            }
            for(int i=0;i<row;i++){
                matrix[i][b]=0;
            }
        }
    }
}
