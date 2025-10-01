class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int max1 =nums[nums.length-1];
        int max2=nums[nums.length-2];
        int max3=nums[nums.length-3];
        int min1=nums[0];
        int min2=nums[1];
        return Math.max(max1*max2*max3, min1*min2*max1);

    }
}