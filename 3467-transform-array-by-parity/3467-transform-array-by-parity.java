class Solution {
    public int[] transformArray(int[] nums) {
        int even=0;
        int odd=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0) even++;
            else odd++;

        }
        for(int i=0;i<even;i++) nums[i]=0;
        for(int i=even;i<nums.length;i++){
            nums[i]=1;
        }
        return nums;
    }
}