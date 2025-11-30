class Solution {
    public void solve(char[][] board) {
        int m=board.length;
        int n=board[0].length;
        int[] drow={-1,0,1,0};
        int[] dcol={0,1,0,-1};
        boolean[][] vis=new boolean[m][n];
        for(int i=0;i<n;i++){
             if(!vis[0][i] && board[0][i]=='O'){
                dfs(board,vis,drow,dcol,0,i,m,n);
             }
             if(!vis[m-1][i] && board[m-1][i]=='O'){
                dfs(board,vis,drow,dcol,m-1,i,m,n);
             }
        }
        for(int i=0;i<m;i++){
             if(!vis[i][0] && board[i][0]=='O'){
                dfs(board,vis,drow,dcol,i,0,m,n);
             }
             if(!vis[i][n-1] && board[i][n-1]=='O'){
                dfs(board,vis,drow,dcol,i,n-1,m,n);
             }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='O' && !vis[i][j]){
                    board[i][j]='X';
                }
            }
        }
    }
    public void dfs(char[][] board,boolean[][] vis,int[] drow,int[] dcol,int r,int c,int m,int n){
        if (r < 0 || r >= m || c < 0 || c >= n) return;
        if (vis[r][c]) return;
        if (board[r][c] != 'O') return;
         vis[r][c]=true;
         for(int i=0;i<4;i++){
            int nr=r+drow[i];
            int nc=c+dcol[i];
            if(nr>=0 && nr<m && nc>=0 && nc<n && board[nr][nc]=='O' && !vis[nr][nc]){
                dfs(board,vis,drow,dcol,nr,nc,m,n);
            }
         }
    }
}