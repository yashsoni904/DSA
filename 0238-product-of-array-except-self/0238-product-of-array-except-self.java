class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] ans = new int[n];
        int[] left = new int[n];
        int[] right = new int[n];
        for(int i=0;i<n;i++){
            if(i==0){
            left[i]=nums[i];
            right[n-i-1]=nums[n-i-1];
            }
            else{
                left[i] = left[i-1]*nums[i];
                right[n-1-i] = right[n-i]*nums[n-i-1];
            }
        } 
        for(int i=0;i<n;i++){
           if(i==0){
              ans[i]= right[i+1];
              continue;
           } 
           if(i==n-1){
              ans[i]=left[i-1];
              continue;
           }
           else{
           ans[i]  = left[i-1]*right[i+1];
           }
        }
        return ans;
    }
}