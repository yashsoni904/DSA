class Solution {
    public int longestPalindromeSubseq(String s) {
        // String c="";
        // for(int i=s.length()-1;i>=0;i--){
        //     c+=s.charAt(i);
        // }   
        String c = new StringBuffer(s).reverse().toString();
        Integer[][] dp = new Integer[s.length()][c.length()];
        return solve(0,0,s,c,dp);
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