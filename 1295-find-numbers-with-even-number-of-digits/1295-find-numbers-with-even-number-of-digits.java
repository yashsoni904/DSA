class Solution {
    public int findNumbers(int[] nums) {
        return helper(nums , 0 );
    }
    int cnt=0;
    public int helper(int[] nums , int i){
        if(i==nums.length) return cnt;
        int num=nums[i];
        int n=0;
        while(num!=0){
            n++;
            num/=10;
        }
        if(n%2==0) cnt++;
        return helper(nums, i+1);

    }


}