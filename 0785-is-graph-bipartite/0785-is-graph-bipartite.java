class Solution {
    public boolean isBipartite(int[][] graph) {
        int V=graph.length;
    //    List<List<Integer>> adj = new ArrayList<>();
    
    //    for(int i=0;i<V;i++){
    //        adj.add(new ArrayList<>());
    //        for(int it: graph[i]){
    //              adj.get(i).add(it);
    //        }
    //    }
       int[] color = new int[V];
       for(int i=0;i<V;i++) color[i]=-1;
       for(int i=0;i<V;i++){
           if(color[i]==-1){
               if(bfscheck(i, V ,color ,graph)==false) return false;
           }
       }
        return true;
    }
    public boolean bfscheck(int node , int V ,int[] color ,int[][] graph ){
          Queue<Integer> q=new  LinkedList<>();
          q.offer(node);
          color[node]=0;
          while(!q.isEmpty()){
              int curr = q.poll();
              for(int it: graph[curr]){
                  if(color[it]==-1){
                     color[it]=1-color[curr];
                     q.add(it);
                  }
                  else if(color[curr]==color[it]) return false;      
              }
          }
          
          return true;
    }
}