class Solution {
    public int pivotIndex(int[] nums) {
        int[] pre =new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            pre[i+1]=pre[i]+nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(pre[i]==(pre[nums.length]-pre[i+1])){
                return i;
            }
        }
        return -1;
    }
}