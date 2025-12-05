class Solution {
    public int countPartitions(int[] nums) {
        int[] presum=new int[nums.length+1];
        int j=0;
        for(int i=0;i<nums.length;i++){
           presum[i+1]=presum[i]+nums[i];
        }
        int cnt=0;
        for(int i=0;i<nums.length-1;i++){
            int left = presum[i+1];
            int right= presum[presum.length-1]-presum[i+1];
            if((left-right)%2==0) cnt++; 
        }
        return cnt;
    }
}