class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max=Arrays.stream(nums).max().getAsInt();
        int l=1;
        int r=max;   //{1,2,3,4,5,6,7,8,9}
        while(l<r){
            int mid=l+(r-l)/2;
            int sum=0;
            for(int i=0;i<nums.length;i++){
               sum=sum+  (nums[i]+mid-1)/mid;
            }
            if(sum<=threshold){
                r=mid;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
}