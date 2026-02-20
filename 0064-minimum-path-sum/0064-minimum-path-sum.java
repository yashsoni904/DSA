class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        Integer[][] dp=new Integer[m][n];
        return solve(0,0,m,n,grid,dp);

    }
    public int solve(int i,int j,int m,int n,int[][] grid,Integer[][] dp){
        if(i==m-1 && j==n-1){
            return grid[i][j];
        } 
        if(i>=m || j>=n) return Integer.MAX_VALUE;

        int right=solve(i,j+1,m,n,grid,dp);
        int down=solve(i+1,j,m,n,grid,dp);

        dp[i][j]=grid[i][j]+Math.min(right,down);
        return dp[i][j];

    }
}