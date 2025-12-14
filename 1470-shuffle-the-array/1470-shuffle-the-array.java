class Solution {
    public int[] shuffle(int[] nums, int n) {
        int f=0;
        int s=n;
        int[] arr =new int[nums.length];
        int i=0;
        while(s<nums.length){
         
            arr[i++]=nums[f++];
            arr[i++]=nums[s++];

        }
        return arr;
    }
}