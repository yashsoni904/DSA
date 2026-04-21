class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        Integer[] dp =new Integer[amount+1];
        int ans = solve( coins , amount , dp);
        if(ans==Integer.MAX_VALUE){
            return -1;
        }
        return ans;
    }
    public int solve(int[] coins, int amount,Integer[] dp ){
        if(amount==0) return 0;
        if(amount<0) return Integer.MAX_VALUE;

        if(dp[amount]!=null) return dp[amount];
        
        int min=Integer.MAX_VALUE; 

        for(int coin : coins){
            int result = solve(coins , amount - coin ,dp);

            if(result != Integer.MAX_VALUE){
                min = Math.min(min , 1+result);
            }
        } 

        dp[amount] = min;

        return min;

    }
}