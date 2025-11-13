class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        if(nums.length<2) return false;
        Map<Integer,Integer> map=new HashMap<>();
        int sum=0;
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            sum =sum+ nums[i];
            int mod=sum%k;
            if(map.containsKey(mod)){
                return true;
            }
            else{
                map.put(mod , i);
            }
        }
        return false;
    }
}