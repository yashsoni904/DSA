class Solution {
    public int countPaths(int n, int[][] roads) {
        List<List<int[]>> adj =new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(int[] e: roads){
            adj.get(e[0]).add(new int[]{e[1],e[2]});
        }
        int[] dist =new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[0]=0;
        int[] way= new int[n];
        way[0]=1;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0]-b[0]);
        pq.offer(new int[]{0,0});
        while(!pq.isEmpty()){
            int[] curr = pq.poll();
            int cd=curr[0];
            int cnode=curr[1];
            for(int[] it : adj.get(cnode)){
                int nextnode=it[0];
                int nd = it[1];
                if(cd+nd<dist[nextnode]){
                    dist[nextnode]=cd+nd;
                    pq.offer(new int[]{dist[nextnode],nextnode});
                    way[nextnode]=way[cnode];
                }
                if(way[nextnode]!=0) way[nextnode]++;
            }
        }
        return way[n-1]+1;

    }
}