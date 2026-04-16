class Solution {
    public int majorityElement(int[] nums) {
        int maj = nums[0];
        int cnt=0;
        for(int n:nums){
            if(cnt==0){
                maj=n;
            }
            if(maj==n){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        return maj;
    }
}