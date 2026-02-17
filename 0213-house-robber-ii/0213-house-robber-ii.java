class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        Integer[] dp1=new Integer[n];
        Integer[] dp2=new Integer[n];

        int case1 = solve(0, n-2, nums, dp1);
        int case2 = solve(1, n-1, nums, dp2);
        
       return Math.max(case1 , case2);
        
      
    }
    public int solve(int i,int end, int[] arr , Integer[] dp){
        if(i>end) return 0;

        if(dp[i]!=null){
            return dp[i];
        }

        int take = arr[i]+solve(i+2,end , arr, dp);
        int skip = solve(i+1,end , arr, dp);

        return dp[i]=Math.max(take,skip);


    }
}