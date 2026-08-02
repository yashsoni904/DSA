class Solution {
    public int minDistance(String word1, String word2) {
        Integer[][] dp =new Integer[word1.length()][word2.length()];
        int lcs = solve(0,0,word1,word2,dp);
        return word1.length()+word2.length()-2 * lcs;
    }
    public int solve(int i,int j,String s,String c,Integer[][] dp){
        if(s.length()==i || c.length()==j){
            return 0;
        }
        if(dp[i][j]!=null) return dp[i][j];

        if(s.charAt(i)==c.charAt(j)){
            return dp[i][j]=1+solve(i+1,j+1,s,c,dp);
        }
        else{
            return dp[i][j]=Math.max(solve(i+1,j,s,c,dp),solve(i,j+1,s,c,dp));
        }
    }
}