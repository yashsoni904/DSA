class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        Integer[][] dp =new Integer[n][n];  
        return solve(0,0 , triangle , dp);
    }
    public int solve(int i,int j,List<List<Integer>> tri,Integer[][] dp){
        if(i==tri.size()-1){
            return tri.get(i).get(j);
        }
        if(dp[i][j]!=null) return dp[i][j];

        int down = tri.get(i).get(j) + solve(i+1,j,tri,dp);
        int diagonal = tri.get(i).get(j) + solve(i+1,j+1,tri,dp);

        return dp[i][j]=Math.min(down,diagonal);
    }
}