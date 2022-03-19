package com.soulmate.structure;

import java.util.Arrays;
import java.util.function.IntUnaryOperator;

public class P73 {

    public void setZeroes(int[][] matrix) {
        boolean[] columns=new boolean[matrix[0].length];
        boolean[] rows=new boolean[matrix.length];

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    columns[j]=true;
                    rows[i]=true;
                }
            }
        }

        for(int i=0;i<rows.length;i++){
            if(rows[i]!=true){
                continue;
            }
            Arrays.setAll(matrix[i], x->{return 0;});
        }
        for(int i=0;i<columns.length;i++){
            if(columns[i]!=true){
                continue;
            }
            for(int j=0;j<rows.length;j++){
                matrix[j][i]=0;
            }
        }
    }
}
