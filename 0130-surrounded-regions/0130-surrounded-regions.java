class Solution {
    public void solve(char[][] board) {
        int m = board.length;
        int n= board[0].length;
        boolean[][] vis = new boolean[m][n];

        for(int i=0;i<n;i++){
            if(board[0][i]=='O' && !vis[0][i]){
                dfs(board , 0 , i , vis , m , n);
            }
            if(board[m-1][i]=='O' && !vis[m-1][i]){
                dfs(board , m-1 , i , vis , m , n);
            }
        }
        for(int i=0;i<m;i++){
            if(board[i][0]=='O' && !vis[i][0]){
                dfs(board , i, 0, vis , m , n);
            }
            if(board[i][n-1]=='O' && !vis[i][n-1]){
                dfs(board , i  , n-1 , vis , m , n);
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='O' && !vis[i][j])
                board[i][j]='X' ; 
            }
        }
    }
    public void dfs(char[][] board,int r,int c,boolean[][] vis,int m,int n){
        if(r<0 || c<0 || r>=m || c>=n ) return;
        if(vis[r][c]) return;
        if(board[r][c]!='O') return;
        vis[r][c]=true;
        int[] drow = {-1,0,1,0};
        int[] dcol = {0,1,0,-1};
        for(int i=0;i<4;i++){
            int nr=r+drow[i];
            int nc=c+dcol[i];
            if(nr>=0 && nc>=0 && nr<m && nc<n && !vis[nr][nc] && board[nr][nc]=='O'){
                  
                  dfs(board,nr,nc,vis,m,n);
            }
        }
    }
}