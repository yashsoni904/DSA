class Solution {
    public int change(int amount, int[] coins) {
        Integer[][] dp =new Integer[coins.length][amount+1];
        return solve(coins.length-1, amount , coins , dp);
    }
    public int solve(int idx , int amount, int[] coins,Integer[][] dp){
        if(amount==0) return 1;

        if(idx==0){
            if(amount%coins[0]==0){
                return 1;
            }
            else return 0;
        }

        if(dp[idx][amount]!=null) return dp[idx][amount];

        int nottake = solve(idx-1 , amount , coins , dp );
        
        int take=0;
        if(amount>=coins[idx])
        take=solve(idx,amount-coins[idx],coins,dp); 
        
        return dp[idx][amount]=take+nottake;
    }
}