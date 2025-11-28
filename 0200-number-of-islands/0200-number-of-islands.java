class Solution {
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int cnt=0;
        int[] drow={-1,0,1,0};
        int[] dcol={0,1,0,-1};
        boolean[][] vis=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                 if(!vis[i][j] && grid[i][j]=='1'){
                    cnt++;
                    dfs(grid,vis,drow,dcol,i,j,m,n);
                 }
            }
        }
        return cnt;
    }
    public void dfs(char[][] grid,boolean[][] vis,int[] drow,int[] dcol,int sr,int sc,int m,int n){
        vis[sr][sc]=true;
        for(int i=0;i<4;i++){
            int nr=sr+drow[i];
            int nc=sc+dcol[i];
            if(nr>=0 && nr<m && nc>=0 && nc<n && grid[nr][nc]=='1' && !vis[nr][nc]){
                dfs(grid,vis,drow,dcol,nr,nc,m,n);
            }
        }
    }
}