class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());

        for(int[] e :flights){
            adj.get(e[0]).add(new int[]{e[1],e[2]});
        }
         
        int[] dist=new int[n];
        Arrays.fill(dist,(int)1e9);
        dist[src]=0;

        Queue<int[]> q =new LinkedList<>();
        q.offer(new int[]{0,src,0});

        while(!q.isEmpty()){
            int[] curr  = q.poll();
            int stop=curr[0];
            int city=curr[1];
            int cost=curr[2];

            if(stop>k) continue;
            for(int[] next : adj.get(city)){
                int nextcity=next[0];
                int price=next[1];
                if(cost+price < dist[nextcity]){
                    dist[nextcity]=cost+price ;
                    q.offer(new int[]{stop+1 , nextcity ,dist[nextcity] });
                }
            }
        }
        return dist[dst]==(int)1e9 ? -1 : dist[dst];
    }

}