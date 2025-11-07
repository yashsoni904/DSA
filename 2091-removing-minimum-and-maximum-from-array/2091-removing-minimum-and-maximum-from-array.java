class Solution {
    public int minimumDeletions(int[] nums) {
       
        int n=nums.length;
        int max=0;
        int min=0;
        for(int i=0;i<n;i++){
            if(nums[max]<nums[i]){
                max=i;
            }
            if(nums[min]>nums[i]){
                min=i;
            }
        }
        int l=Math.min(max,min);
        int r=Math.max(max,min);

        int leftRemove=r+1;
        int rigthRemove=n-l;
        int bothSideRemove=(l+1)+(n-r);

        return Math.min(leftRemove,Math.min(rigthRemove,bothSideRemove));

        
    }

}