class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int i=0;i<k;i++){
            int min=min(nums);
            nums[min]*=multiplier;
        }
        return nums;
    }
    public int min(int[] nums){
        int minindex=0;
        int min=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){ 
                min=nums[i];
                minindex=i;
            }
        }
        return minindex;
    }
}