class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        Integer[] dp = new Integer[n];
        
        return solve(0,nums,dp);
    }
    public int solve(int i,int[] arr , Integer[] dp){
        if(i>=arr.length) return 0;

        if(dp[i]!=null){
            return dp[i];
        }

        int take = arr[i]+solve(i+2 , arr, dp);
        int skip = solve(i+1 , arr, dp);

        return dp[i]=Math.max(take,skip);


    }
}