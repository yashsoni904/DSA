class Solution {
    public int minimumEffortPath(int[][] heights) {
        int n=heights.length;
        int m=heights[0].length;
        int[] dr={-1,0,1,0};
        int[] dc={0,1,0,-1};
        int[][] dist=new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(dist[i],Integer.MAX_VALUE);
        }
        dist[0][0]=0;
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        pq.offer(new int[]{0,0,0});
        while(!pq.isEmpty()){
            int[] curr=pq.poll();
            int d=curr[0];
            int r=curr[1];
            int c=curr[2];
            if(r==n-1 && c==m-1) return d;

            for(int i=0;i<4;i++){
                int nr=r+dr[i];
                int nc=c+dc[i];
                if(nr>=0 && nc>=0 && nr<n && nc<m){
                    int diff=Math.abs(heights[r][c]-heights[nr][nc]);
                    int newd=Math.max(diff, d);
                    if(newd<dist[nr][nc]){
                        dist[nr][nc]=newd;
                        pq.offer(new int[]{newd,nr,nc});
                    }
                }
            }
        }
        return 0;

    }
}