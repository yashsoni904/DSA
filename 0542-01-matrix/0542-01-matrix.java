class Solution {
    class Pair{
        int f,s,t;
        Pair(int f,int s,int t){
            this.f=f;this.s=s;this.t=t;
        }
    }
    public int[][] updateMatrix(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int[] drow={-1,0,1,0};
        int[] dcol={0,1,0,-1};
        boolean[][] vis =new boolean[m][n];
        int[][] ans = new int[m][n];
        Queue<Pair> q=new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               if(mat[i][j]==0) q.offer(new Pair(i,j,0));
            }
        }
        bfs(mat,ans,vis,q,drow,dcol,m,n);
        return ans;
    }
    public void bfs(int[][] mat,int[][] ans,boolean[][] vis,Queue<Pair> q,int[] drow, int[] dcol,int m,int n){
        while(!q.isEmpty()){
            int r=q.peek().f;
            int c=q.peek().s;
            int dist=q.peek().t;
            q.poll();
            ans[r][c]=dist;
            vis[r][c]=true;
            for(int i=0;i<4;i++){
                int nr=r+drow[i];
                int nc=c+dcol[i];
                if(nr>=0 && nr<m && nc>=0 && nc<n && mat[nr][nc]==1 && !vis[nr][nc]){
                    q.offer(new Pair(nr,nc,dist+1));
                    vis[nr][nc]=true;
                }
            }
        }
    }
}