class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int V=graph.length;
        List<List<Integer>> revadj = new ArrayList<>();
        for(int i=0;i<V;i++) revadj.add(new ArrayList<>());
        int[] indeg = new int[V];
        for(int i=0;i<V;i++){
            for(int j=0;j<graph[i].length;j++){
               int v=graph[i][j];
               revadj.get(v).add(i);
               indeg[i]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<V;i++){
            if(indeg[i]==0) q.offer(i);
        }
        while(!q.isEmpty()){
            int curr=q.poll();
            ans.add(curr);
            for(int it:revadj.get(curr)){
                indeg[it]--;
                if(indeg[it]==0) q.offer(it);
            }
        }
        Collections.sort(ans);
        return ans;

    }
}