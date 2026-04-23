class Solution {
    public int maxSubarraySumCircular(int[] nums) {
       int n=nums.length;  

       int maxSum=0;
       int maxSub=nums[0];

       int minSum=0;
       int minSub=nums[0];
      
       int totalSum=0;

       
       for(int i=0;i<n;i++){
          totalSum+=nums[i];

          maxSum+=nums[i];
          if(maxSub<maxSum) maxSub=maxSum;

          minSum+=nums[i];
          if(minSub>minSum) minSub=minSum;

          if(maxSum<0) maxSum=0;
          if(minSum>0) minSum=0;
       }
       if(maxSub<0 && totalSum<0) return maxSub;
       return Math.max(totalSum - minSub , maxSub); 
       
    }
}