package com.soulmate.algorithm;

public class P695 {

    public int maxAreaOfIsland(int[][] grid) {
        boolean[][] flag = new boolean[grid.length][grid[0].length];
        int max=0,tmp;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(flag[i][j])
                    continue;
                tmp=dfs(flag,grid,i,j);
                if(max<tmp)
                    max=tmp;
            }
        }
        return max;
    }

    public int dfs(boolean[][] flag,int[][] grid,int r,int c){
        if(r<0||c<0||r>=grid.length||c>=grid[0].length||grid[r][c]==0||flag[r][c])
            return 0;

        int max=1;
        flag[r][c]=true;
        max+=dfs(flag,grid,r+1,c);
        max+=dfs(flag,grid,r-1,c);
        max+=dfs(flag,grid,r,c+1);
        max+=dfs(flag,grid,r,c-1);
        return max;
    }
}
