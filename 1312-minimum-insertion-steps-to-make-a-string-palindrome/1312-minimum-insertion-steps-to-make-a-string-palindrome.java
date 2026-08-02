class Solution {
    public int minInsertions(String s) {
        String c = new StringBuffer(s).reverse().toString();
        Integer[][] dp =new Integer[s.length()][s.length()];
        int rever = solve(0,0,s,c,dp);
        return s.length()-rever;
    }
    public int solve(int i,int j,String s,String c,Integer[][] dp){
        if(i==s.length() || j==c.length()){
            return 0;
        }
        if(dp[i][j]!=null) return dp[i][j];

        if(s.charAt(i)==c.charAt(j)) return dp[i][j]=1+solve(i+1,j+1,s,c,dp);
        else{
            return dp[i][j]=Math.max(solve(i,j+1,s,c,dp),solve(i+1,j,s,c,dp));
        }
    }
}