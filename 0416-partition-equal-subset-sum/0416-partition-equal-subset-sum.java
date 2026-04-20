class Solution {
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++) sum+=nums[i];
        if(sum%2!=0) return false;
        int target =  sum/2;
        Boolean[][] dp =new Boolean[n][target+1];
        return solve(n-1 , nums,dp,target);
    }
    public boolean solve(int idx , int[] nums,Boolean[][] dp,int target){
        if(target==0) return true;

        if(idx==0) return nums[0]==target;

        if(dp[idx][target]!=null) return dp[idx][target];

        boolean notTake=solve(idx-1,nums,dp,target);
        boolean take=false;
        if(nums[idx]<=target) {
            take = solve(idx-1,nums,dp,target-nums[idx]);
        }

        return dp[idx][target]=(take  || notTake);
      
    }
}