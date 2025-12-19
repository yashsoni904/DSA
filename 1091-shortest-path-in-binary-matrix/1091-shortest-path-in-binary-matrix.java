class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;
        if(grid[0][0]==1 || grid[n-1][n-1]==1) return -1;
        int[][] dist=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dist[i][j]=(int)1e9;
            }
        }
        dist[0][0]=1;
        int[] drow={-1,0,1,0,-1,1,-1,1};
        int[] dcol={0,1,0,-1,1,1,-1,-1};
        Queue<int[]> q=new LinkedList<>();
        q.offer(new int[]{0,0});
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int r=curr[0];
            int c=curr[1];
            for(int i=0;i<8;i++){
                int nr=r+drow[i];
                int nc=c+dcol[i];
                if(nr>=0&&nr<n&&nc>=0&&nc<n&& grid[nr][nc]==0 && dist[r][c]+1 < dist[nr][nc]){
                    dist[nr][nc]=dist[r][c]+1 ;
                    if(nr==n-1 && nc==n-1) return dist[nr][nc];
                    q.offer(new int[]{nr,nc});
                }
            }
        }
        return -1;
    }
}