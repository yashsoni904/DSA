class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<int[]>> adj = new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());

        for(int[] e : times){
            adj.get(e[0]-1).add(new int[]{e[1]-1,e[2]});
        }

        int[] time = new int[n];
        Arrays.fill(time,(int)1e9);
        time[k-1]=0;

        PriorityQueue<int[]> pq =new PriorityQueue<>((a,b)->a[0]-b[0]);
        pq.offer(new int[]{0,k-1});
        
        while(!pq.isEmpty()){
            int[] curr=pq.poll();
            int ct=curr[0];  //current node time 
            int cn=curr[1];  //current node
            if(ct>time[cn]) continue;
            for(int[] it : adj.get(cn)){
                int nextnode=it[0];
                int nexttime=it[1];
                if(ct + nexttime < time[nextnode]){
                    time[nextnode]=ct + nexttime;
                    pq.offer(new int[]{time[nextnode],nextnode});
                }
            }
        }
        int max=0;
        for(int i=0;i<n;i++){
            if(time[i]==(int)1e9) return -1;
            if(max<time[i]) max=time[i];
        }
        return max;
    }
}