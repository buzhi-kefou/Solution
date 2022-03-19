package com.soulmate.algorithm;

public class P733 {

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        boolean[][] flag=new boolean[image.length][image[0].length];

        dfs(flag,image,sr,sc,newColor,image[sr][sc]);

        return image;
    }

    public void dfs(boolean[][] flag,int[][] grid,int r,int c,int color,int original){
        if(r<0||c<0||r>=grid.length||c>=grid[0].length||grid[r][c]!=original||flag[r][c])
            return ;

        flag[r][c]=true;
        grid[r][c]=color;
        dfs(flag,grid,r+1,c,color,original);
        dfs(flag,grid,r-1,c,color,original);
        dfs(flag,grid,r,c+1,color,original);
        dfs(flag,grid,r,c-1,color,original);
    }
}
