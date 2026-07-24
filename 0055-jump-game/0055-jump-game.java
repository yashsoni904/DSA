class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        Boolean[] dp = new Boolean[n];
        boolean ans = jump(nums, dp , 0);
        return ans;


    }
    public boolean jump(int[] nums , Boolean[] dp , int idx){
       
        if(idx == nums.length-1)  return true;
       
        if(dp[idx]!=null) return dp[idx];

        int step = nums[idx];
        for(int i=1;i<=step;i++){
            if(jump(nums,dp,idx+i)){
                return dp[idx] = true; 
            }
        }
        return dp[idx] = false; 
    }
}