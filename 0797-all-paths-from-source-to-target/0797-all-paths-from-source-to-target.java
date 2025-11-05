class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans =new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        path.add(0);
        helper(0,graph,path,ans);
        return ans;
         
    }
    public void helper(int curr,int[][] g,List<Integer> path,List<List<Integer>> ans){
        int n=g.length-1;
        if(n==curr){
            ans.add(new ArrayList<>(path));
            return;
        }

        for(int v: g[curr]){
            path.add(v);
            helper(v,g,path,ans);
            path.remove(path.size()-1);
        }

    }
}