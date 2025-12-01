class Solution {
    public int numEnclaves(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[] drow={-1,0,1,0};
        int[] dcol={0,1,0,-1};
        boolean[][] vis=new boolean[m][n];
        for(int i=0;i<n;i++){
            if(!vis[0][i] && grid[0][i]==1){
                dfs(grid, vis, drow,dcol,0,i,m,n);
            }
            if(!vis[m-1][i] && grid[m-1][i]==1){
                dfs(grid, vis, drow,dcol,m-1,i,m,n);
            }
        }
        for(int i=0;i<m;i++){
            if(!vis[i][0] && grid[i][0]==1){
                dfs(grid, vis, drow,dcol,i,0,m,n);
            }
            if(!vis[i][n-1] && grid[i][n-1]==1){
                dfs(grid, vis, drow,dcol,i,n-1,m,n);
            }
        }
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 && !vis[i][j]) count++;
            }
        }
        return count;
    }
    public void dfs(int[][] grid , boolean[][] vis ,int[] drow,int[] dcol,int r,int c, int m ,int n){
           vis[r][c]=true;
           for(int i=0;i<4;i++){
              int nr=r+drow[i];
              int nc=c+dcol[i];
              if(nr>=0 && nr<m && nc>=0 && nc<n && grid[nr][nc]==1 && !vis[nr][nc]){
                  dfs(grid, vis, drow,dcol,nr,nc,m,n);
              }
           }
    }
}