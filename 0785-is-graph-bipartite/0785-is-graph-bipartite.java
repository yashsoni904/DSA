class Solution {
    public boolean isBipartite(int[][] graph) {
        int V=graph.length;
    
       int[] colorarr = new int[V];
       for(int i=0;i<V;i++) colorarr[i]=-1;

       for(int i=0;i<V;i++){
           if(colorarr[i]==-1){
               if(dfscheck(i,0 ,colorarr ,graph)==false) return false;
           }
       }
        return true;
    }
    public boolean dfscheck(int node ,int color ,int[] colorarr ,int[][] graph ){
          
          colorarr[node]=color;
          for(int it: graph[node]){
            if(colorarr[it]==-1){
                if(!dfscheck(it, 1-color ,colorarr ,graph)) return false;
            }
            else if(colorarr[it]==colorarr[node]) return false;
          }
          return true;
    }
}