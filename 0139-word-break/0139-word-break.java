class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set =new HashSet<>(wordDict);
        Boolean[] dp = new Boolean[s.length()];
        return solve(s,set,0,dp);

    }
    public boolean solve(String s , Set<String> set ,int start,Boolean[] dp){
        if(start == s.length()){
            return true;
        }
        if(dp[start]!=null) return dp[start];

        for(int end=start+1 ; end<=s.length();end++){
            if(set.contains(s.substring(start,end))){
                
                if(solve(s,set , end,dp)){
                     dp[start]=true;
                     return true;
                }
            }
        }
        dp[start]=false;
        return false;
    }
}