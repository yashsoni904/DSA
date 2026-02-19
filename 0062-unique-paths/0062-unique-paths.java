class Solution {
    public int uniquePaths(int m, int n) {
        
        Integer[][] dp = new Integer[m][n];

        return path(0,0,m,n,dp);
    }
    public int path(int r ,int c , int m,int n,Integer[][] dp){
        if(r==m-1 && c==n-1) return 1;
        if(r>=m || c>=n) return 0;
        if(dp[r][c]!=null) return dp[r][c];
        int right = path(r , c+1 , m,n,dp);
        int down= path(r+1 , c ,m,n,dp);
        return dp[r][c]=right+down;
    }
}