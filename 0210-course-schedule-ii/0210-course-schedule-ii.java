class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj =new ArrayList<>();
        for(int i=0;i<numCourses;i++) adj.add(new ArrayList<>());
        int[] indeg=new int[numCourses];
        for(int[] e:prerequisites){
           int u=e[0];
           int v=e[1];
           adj.get(v).add(u);
           indeg[u]++;
        }
        Queue<Integer> q =new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indeg[i]==0) q.offer(i);
        }
        int[] topo = new int[numCourses];
        int idx=0;
        while(!q.isEmpty()){
            int curr=q.poll();
            topo[idx++]=curr;
            for(int it:adj.get(curr)){
                indeg[it]--;
                if(indeg[it]==0) q.offer(it);
            }
        }
        if(idx==numCourses) return topo;
        int[] arr = {};
        return arr;

    }
}