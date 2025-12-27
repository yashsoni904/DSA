class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int[] l= new int[n];
        int[] r= new int[n];
        int[] ans= new int[n];
        for(int i=0;i<n-1;i++){
            l[i+1]=nums[i]+l[i];
        }
        for(int i=n-1;i>0;i--){
            r[i-1]=nums[i]+r[i];
        }
        for(int i=0;i<n;i++){
            ans[i]= Math.abs(l[i]-r[i]);
        }
        return ans;
    }
}